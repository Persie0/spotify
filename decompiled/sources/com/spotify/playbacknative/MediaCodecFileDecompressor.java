package com.spotify.playbacknative;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Keep;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class MediaCodecFileDecompressor {
    private MediaCodec mCodec;
    private boolean mEndOfInputStream;
    private boolean mExecuting;
    private final Context mInjectedContext;
    private ByteBuffer[] mInputBuffers;
    private MediaFormat mInputFormat;
    private final MediaCodecFactory mMediaCodecFactory;
    private MediaExtractor mMediaExtractor;
    private final MediaExtractorFactory mMediaExtractorFactory;
    private final NativeWrapper mNativeWrapper;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputFormat;
    private long nThis;

    public static class DefaultMediaCodecFactory implements MediaCodecFactory {
        public /* synthetic */ DefaultMediaCodecFactory(int i) {
            this();
        }

        @Override // com.spotify.playbacknative.MediaCodecFileDecompressor.MediaCodecFactory
        public MediaCodec createDecoderByType(String str) {
            return MediaCodec.createDecoderByType(str);
        }

        private DefaultMediaCodecFactory() {
        }
    }

    public static class DefaultMediaExtractorFactory implements MediaExtractorFactory {
        public /* synthetic */ DefaultMediaExtractorFactory(int i) {
            this();
        }

        @Override // com.spotify.playbacknative.MediaCodecFileDecompressor.MediaExtractorFactory
        public MediaExtractor createExtractor() {
            return new MediaExtractor();
        }

        private DefaultMediaExtractorFactory() {
        }
    }

    public class DefaultNativeWrapper implements NativeWrapper {
        public /* synthetic */ DefaultNativeWrapper(MediaCodecFileDecompressor mediaCodecFileDecompressor, int i) {
            this();
        }

        @Override // com.spotify.playbacknative.MediaCodecFileDecompressor.NativeWrapper
        public void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z) {
            MediaCodecFileDecompressor.this.onOutputBuffer(byteBuffer, i, i2, z);
        }

        private DefaultNativeWrapper() {
        }
    }

    public interface MediaCodecFactory {
        MediaCodec createDecoderByType(String str);
    }

    public interface MediaExtractorFactory {
        MediaExtractor createExtractor();
    }

    public interface NativeWrapper {
        void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);
    }

    public MediaCodecFileDecompressor(Context context) {
        this.mInjectedContext = context;
        int i = 0;
        this.mNativeWrapper = new DefaultNativeWrapper(this, i);
        this.mMediaCodecFactory = new DefaultMediaCodecFactory(i);
        this.mMediaExtractorFactory = new DefaultMediaExtractorFactory(i);
    }

    private void decodeInternal(boolean z) {
        int iDequeueInputBuffer;
        if (!this.mExecuting) {
            Logger.m17647e("Ignoring request to decode in non-executing state", new Object[0]);
            return;
        }
        try {
            if (!this.mEndOfInputStream && (iDequeueInputBuffer = this.mCodec.dequeueInputBuffer(0L)) >= 0) {
                int sampleData = this.mMediaExtractor.readSampleData(this.mInputBuffers[iDequeueInputBuffer], 0);
                if (sampleData < 0) {
                    this.mCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.mEndOfInputStream = true;
                } else {
                    this.mCodec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.mMediaExtractor.getSampleTime(), 0);
                    this.mMediaExtractor.advance();
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer >= 0) {
                if (z) {
                    this.mNativeWrapper.onOutputBuffer(this.mOutputBuffers[iDequeueOutputBuffer], bufferInfo.offset, bufferInfo.size, (bufferInfo.flags & 4) == 4);
                } else {
                    Logger.m17647e("Got data before output format, that shouldn't happen!", new Object[0]);
                }
                this.mCodec.releaseOutputBuffer(iDequeueOutputBuffer, true);
                return;
            }
            if (iDequeueOutputBuffer == -3) {
                this.mOutputBuffers = this.mCodec.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                this.mOutputFormat = this.mCodec.getOutputFormat();
            }
        } catch (IllegalStateException e) {
            handleCodecError(e);
        }
    }

    private void handleCodecError(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
            Logger.m17647e("MediaCodec error, stopping codec: code=%d diagnostic=%s", Integer.valueOf(codecException.getErrorCode()), codecException.getDiagnosticInfo());
        } else {
            Logger.m17647e("MediaCodec error, stopping codec: %s", illegalStateException.getMessage());
        }
        this.mExecuting = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);

    public void decode() {
        decodeInternal(true);
    }

    public void destroy() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec != null) {
            this.mExecuting = false;
            try {
                mediaCodec.stop();
            } catch (IllegalStateException e) {
                Logger.m17647e("IllegalStateException when stopping MediaCodec: %s", e.getMessage());
            }
            this.mCodec.release();
        }
        MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }

    public int getChannelCount() {
        if (this.mOutputFormat.containsKey("channel-count")) {
            return this.mOutputFormat.getInteger("channel-count");
        }
        return -1;
    }

    public long getDurationUs() {
        if (this.mInputFormat.containsKey("durationUs")) {
            return this.mInputFormat.getLong("durationUs");
        }
        return -1L;
    }

    public String getMimeType() {
        return this.mInputFormat.containsKey("mime") ? this.mInputFormat.getString("mime") : "";
    }

    public int getSampleRate() {
        if (this.mOutputFormat.containsKey("sample-rate")) {
            return this.mOutputFormat.getInteger("sample-rate");
        }
        return -1;
    }

    public boolean open(String str) {
        try {
            this.mMediaExtractor = this.mMediaExtractorFactory.createExtractor();
            Uri uri = Uri.parse(str);
            if (this.mInjectedContext == null || !"content".equals(uri.getScheme())) {
                this.mMediaExtractor.setDataSource(str);
            } else {
                this.mMediaExtractor.setDataSource(this.mInjectedContext, uri, (Map<String, String>) null);
            }
            int trackCount = this.mMediaExtractor.getTrackCount();
            if (trackCount == 0) {
                Logger.m17648w("No tracks found in media file", new Object[0]);
            }
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i);
                this.mInputFormat = trackFormat;
                String string = trackFormat.getString("mime");
                if (string.startsWith("audio/")) {
                    this.mMediaExtractor.selectTrack(i);
                    MediaCodec mediaCodecCreateDecoderByType = this.mMediaCodecFactory.createDecoderByType(string);
                    this.mCodec = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(this.mInputFormat, (Surface) null, (MediaCrypto) null, 0);
                    break;
                }
            }
            MediaCodec mediaCodec = this.mCodec;
            if (mediaCodec == null) {
                Logger.m17647e("MediaCodec not found in media file", new Object[0]);
                return false;
            }
            mediaCodec.start();
            this.mExecuting = true;
            this.mInputBuffers = this.mCodec.getInputBuffers();
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
            int i2 = 0;
            while (this.mOutputFormat == null) {
                decodeInternal(false);
                if (!this.mExecuting) {
                    Logger.m17647e("MediaCodec stopped before the output format was known", new Object[0]);
                    return false;
                }
                i2++;
                if (i2 > 100) {
                    Logger.m17647e("MediaFormat not found in media file", new Object[0]);
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            Logger.m17647e("IOException when opening media file", new Object[0]);
            return false;
        } catch (IllegalArgumentException unused2) {
            Logger.m17647e("IllegalArgumentException when opening media file", new Object[0]);
            return false;
        } catch (IllegalStateException unused3) {
            Logger.m17647e("IllegalStateException when opening media file", new Object[0]);
            return false;
        } catch (UnsupportedOperationException unused4) {
            Logger.m17647e("UnsupportedOperationException when opening media file", new Object[0]);
            return false;
        }
    }

    public void seekToUs(long j) {
        this.mMediaExtractor.seekTo(j, 1);
        if (this.mExecuting) {
            try {
                this.mCodec.flush();
            } catch (IllegalStateException e) {
                handleCodecError(e);
            }
        }
        this.mEndOfInputStream = false;
    }

    public MediaCodecFileDecompressor(Context context, NativeWrapper nativeWrapper, MediaCodecFactory mediaCodecFactory, MediaExtractorFactory mediaExtractorFactory) {
        this.mInjectedContext = context;
        this.mNativeWrapper = nativeWrapper;
        this.mMediaCodecFactory = mediaCodecFactory;
        this.mMediaExtractorFactory = mediaExtractorFactory;
    }
}
