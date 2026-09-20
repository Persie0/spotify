package spotify.speechless.p211v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kc2;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class GifMedia extends AbstractC0269h implements sre0 {
    private static final GifMedia DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TRACK_URI_FIELD_NUMBER = 7;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 5;
    private int bitField0_;
    private int height_;
    private int rating_;
    private int width_;
    private String id_ = "";
    private String url_ = "";
    private String title_ = "";
    private String trackUri_ = "";

    static {
        GifMedia gifMedia = new GifMedia();
        DEFAULT_INSTANCE = gifMedia;
        AbstractC0269h.registerDefaultInstance(GifMedia.class, gifMedia);
    }

    private GifMedia() {
    }

    /* JADX INFO: renamed from: n */
    public static GifMedia m97988n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u0004\u0006\u0004\u0007ለ\u0000", new Object[]{"bitField0_", "id_", "url_", "title_", "rating_", "width_", "height_", "trackUri_"});
        }
        if (iOrdinal == 3) {
            return new GifMedia();
        }
        if (iOrdinal == 4) {
            return new qb10(DEFAULT_INSTANCE, 23);
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
        synchronized (GifMedia.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUrl() {
        return this.url_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m97989o() {
        return this.height_;
    }

    /* JADX INFO: renamed from: p */
    public final kc2 m97990p() {
        kc2 kc2Var;
        int i = this.rating_;
        if (i == 0) {
            kc2Var = kc2.AGE_RATING_UNSPECIFIED;
        } else if (i == 1) {
            kc2Var = kc2.AGE_RATING_Y;
        } else if (i == 2) {
            kc2Var = kc2.AGE_RATING_G;
        } else if (i == 3) {
            kc2Var = kc2.AGE_RATING_PG;
        } else if (i != 4) {
            kc2Var = i != 5 ? null : kc2.AGE_RATING_R;
        } else {
            kc2Var = kc2.AGE_RATING_PG13;
        }
        return kc2Var == null ? kc2.UNRECOGNIZED : kc2Var;
    }

    /* JADX INFO: renamed from: q */
    public final String m97991q() {
        return this.trackUri_;
    }

    /* JADX INFO: renamed from: r */
    public final int m97992r() {
        return this.width_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m97993s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
