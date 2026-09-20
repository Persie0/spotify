package com.spotify.contentdelivery.mediaprocessing;

import kotlin.Metadata;
import p204p.edb;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult;", "", "Success", "Fail", "Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult$Fail;", "Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult$Success;", "src_main_java_com_spotify_contentdelivery_mediaprocessing-mediaprocessing"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface CreateProcessorResult {

    @Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult$Fail;", "Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult;", "code", "", "<init>", "(I)V", "getCode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "src_main_java_com_spotify_contentdelivery_mediaprocessing-mediaprocessing"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Fail implements CreateProcessorResult {
        private final int code;

        public Fail(int i) {
            this.code = i;
        }

        public static /* synthetic */ Fail copy$default(Fail fail, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fail.code;
            }
            return fail.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public final Fail copy(int code) {
            return new Fail(code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fail) && this.code == ((Fail) other).code;
        }

        public final int getCode() {
            return this.code;
        }

        public int hashCode() {
            return Integer.hashCode(this.code);
        }

        public String toString() {
            return edb.m38563l("Fail(code=", this.code, ")");
        }
    }

    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult$Success;", "Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult;", "processor", "Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessor;", "<init>", "(Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessor;)V", "getProcessor", "()Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessor;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_contentdelivery_mediaprocessing-mediaprocessing"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Success implements CreateProcessorResult {
        private final NativeMediaProcessor processor;

        public Success(NativeMediaProcessor nativeMediaProcessor) {
            this.processor = nativeMediaProcessor;
        }

        public static /* synthetic */ Success copy$default(Success success, NativeMediaProcessor nativeMediaProcessor, int i, Object obj) {
            if ((i & 1) != 0) {
                nativeMediaProcessor = success.processor;
            }
            return success.copy(nativeMediaProcessor);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NativeMediaProcessor getProcessor() {
            return this.processor;
        }

        public final Success copy(NativeMediaProcessor processor) {
            return new Success(processor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && wj50.m88271j(this.processor, ((Success) other).processor);
        }

        public final NativeMediaProcessor getProcessor() {
            return this.processor;
        }

        public int hashCode() {
            return this.processor.hashCode();
        }

        public String toString() {
            return "Success(processor=" + this.processor + ")";
        }
    }
}
