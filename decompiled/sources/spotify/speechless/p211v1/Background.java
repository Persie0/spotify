package spotify.speechless.p211v1;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Background extends AbstractC0269h implements sre0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final Background DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object format_;
    private int formatCase_ = 0;
    private String aspectRatio_ = "";

    static {
        Background background = new Background();
        DEFAULT_INSTANCE = background;
        AbstractC0269h.registerDefaultInstance(Background.class, background);
    }

    private Background() {
    }

    /* JADX INFO: renamed from: o */
    public static Background m97979o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001>\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004ለ\u0000", new Object[]{"format_", "formatCase_", "bitField0_", "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new Background();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 7);
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
        synchronized (Background.class) {
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

    public final int getColor() {
        if (this.formatCase_ == 1) {
            return ((Integer) this.format_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getImageUrl() {
        return this.formatCase_ == 3 ? (String) this.format_ : "";
    }

    /* JADX INFO: renamed from: n */
    public final String m97980n() {
        return this.aspectRatio_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m97981p() {
        int i = this.formatCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public final String m97982q() {
        return this.formatCase_ == 2 ? (String) this.format_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
