package spotify.speechless.p211v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.aga1;
import p204p.byd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class UGCMedia extends AbstractC0269h implements sre0 {
    private static final UGCMedia DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 7;
    public static final int FILE_SIZE_BYTES_FIELD_NUMBER = 6;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
    public static final int MEDIA_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 1;
    public static final int UPLOAD_SOURCE_FIELD_NUMBER = 8;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private Duration duration_;
    private long fileSizeBytes_;
    private int height_;
    private int mediaType_;
    private int uploadSource_;
    private int width_;
    private String thumbnailUrl_ = "";
    private String mediaUrl_ = "";

    static {
        UGCMedia uGCMedia = new UGCMedia();
        DEFAULT_INSTANCE = uGCMedia;
        AbstractC0269h.registerDefaultInstance(UGCMedia.class, uGCMedia);
    }

    private UGCMedia() {
    }

    /* JADX INFO: renamed from: n */
    public static UGCMedia m98001n() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0004\u0005\u0004\u0006\u0002\u0007ဉ\u0000\b\f", new Object[]{"bitField0_", "thumbnailUrl_", "mediaUrl_", "mediaType_", "width_", "height_", "fileSizeBytes_", "duration_", "uploadSource_"});
        }
        if (iOrdinal == 3) {
            return new UGCMedia();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 13);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (UGCMedia.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    public final boolean hasDuration() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m98002o() {
        return this.fileSizeBytes_;
    }

    /* JADX INFO: renamed from: p */
    public final int m98003p() {
        return this.height_;
    }

    /* JADX INFO: renamed from: q */
    public final byd0 m98004q() {
        byd0 byd0Var;
        int i = this.mediaType_;
        if (i == 0) {
            byd0Var = byd0.MEDIA_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            byd0Var = i != 2 ? null : byd0.MEDIA_TYPE_VIDEO;
        } else {
            byd0Var = byd0.MEDIA_TYPE_IMAGE;
        }
        return byd0Var == null ? byd0.UNRECOGNIZED : byd0Var;
    }

    /* JADX INFO: renamed from: r */
    public final String m98005r() {
        return this.mediaUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final String m98006s() {
        return this.thumbnailUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final aga1 m98007t() {
        aga1 aga1Var;
        int i = this.uploadSource_;
        if (i == 0) {
            aga1Var = aga1.UPLOAD_SOURCE_UNSPECIFIED;
        } else if (i != 1) {
            aga1Var = i != 2 ? null : aga1.UPLOAD_SOURCE_LIBRARY;
        } else {
            aga1Var = aga1.UPLOAD_SOURCE_CAMERA;
        }
        return aga1Var == null ? aga1.UNRECOGNIZED : aga1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final int m98008u() {
        return this.width_;
    }
}
