package com.spotify.contentdelivery.mediaprocessingimpl;

import com.spotify.contentdelivery.mediaprocessing.CreateProcessorResult;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory;
import com.spotify.contentdelivery.mediaprocessing.ProcessingMode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\f\u0010\u0003R$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/contentdelivery/mediaprocessingimpl/NativeMediaProcessorFactoryImpl;", "Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessorFactory;", "<init>", "()V", "", "handleId", "Lcom/spotify/contentdelivery/mediaprocessing/ProcessingMode;", "mode", "Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult;", "createProcessor", "(ILcom/spotify/contentdelivery/mediaprocessing/ProcessingMode;)Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult;", "Lp/w2a1;", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "src_main_java_com_spotify_contentdelivery_mediaprocessingimpl-mediaprocessingimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeMediaProcessorFactoryImpl implements NativeMediaProcessorFactory {
    private long nThis;

    private NativeMediaProcessorFactoryImpl() {
    }

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory
    public native CreateProcessorResult createProcessor(int handleId, ProcessingMode mode);

    public final native void destroy();

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory
    public long getNThis() {
        return this.nThis;
    }
}
