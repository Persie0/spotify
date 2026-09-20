package androidx.media3.transformer;

import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import com.spotify.searchview.proto.AudioEpisode;
import p204p.edb;
import p204p.via;
import p204p.vsv0;
import p204p.xe40;

/* JADX INFO: loaded from: classes.dex */
public final class ExportException extends Exception {

    /* JADX INFO: renamed from: b */
    public static final vsv0 f1113b;

    /* JADX INFO: renamed from: a */
    public final int f1114a;

    static {
        xe40 xe40Var = new xe40();
        xe40Var.m90435h("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        xe40Var.m90435h("ERROR_CODE_IO_UNSPECIFIED", Integer.valueOf(AudioEpisode.SHOW_URI_FIELD_NUMBER));
        xe40Var.m90435h("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        xe40Var.m90435h("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", Integer.valueOf(AudioEpisode.VIDEO_FORMAT_FIELD_NUMBER));
        xe40Var.m90435h("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        xe40Var.m90435h("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        xe40Var.m90435h("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        xe40Var.m90435h("ERROR_CODE_IO_NO_PERMISSION", 2006);
        xe40Var.m90435h("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        xe40Var.m90435h("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        xe40Var.m90435h("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        xe40Var.m90435h("ERROR_CODE_DECODING_FAILED", 3002);
        xe40Var.m90435h("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        xe40Var.m90435h("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        xe40Var.m90435h("ERROR_CODE_ENCODING_FAILED", 4002);
        xe40Var.m90435h("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        xe40Var.m90435h("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        xe40Var.m90435h("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        xe40Var.m90435h("ERROR_CODE_MUXING_FAILED", 7001);
        xe40Var.m90435h("ERROR_CODE_MUXING_TIMEOUT", 7002);
        xe40Var.m90435h("ERROR_CODE_MUXING_APPEND", 7003);
        f1113b = xe40Var.mo85344d();
    }

    public ExportException(String str, Throwable th, int i, int i2) {
        super(str, th);
        this.f1114a = i;
        SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    public static ExportException m868a(int i, Throwable th) {
        return new ExportException("Asset loader error", th, i, 0);
    }

    /* JADX INFO: renamed from: b */
    public static ExportException m869b(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, String str) {
        StringBuilder sbM38572u = edb.m38572u("Audio error: ", str, ", audioFormat=");
        sbM38572u.append(audioProcessor$UnhandledAudioFormatException.f968a);
        return new ExportException(sbM38572u.toString(), audioProcessor$UnhandledAudioFormatException, 6001, 0);
    }

    /* JADX INFO: renamed from: c */
    public static ExportException m870c(Exception exc, int i, via viaVar) {
        return new ExportException("Codec exception: " + viaVar, exc, i, 0);
    }

    /* JADX INFO: renamed from: d */
    public static ExportException m871d(Exception exc) {
        return exc instanceof RuntimeException ? new ExportException("Unexpected runtime error", exc, 1001, 0) : new ExportException("Unexpected error", exc, 1000, 0);
    }
}
