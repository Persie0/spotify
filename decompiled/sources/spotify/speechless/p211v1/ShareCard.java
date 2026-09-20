package spotify.speechless.p211v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kc40;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareCard extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_FIELD_NUMBER = 8;
    public static final int COLOR_FIELD_NUMBER = 3;
    public static final int DATE_FIELD_NUMBER = 6;
    private static final ShareCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int EXPLICIT_FIELD_NUMBER = 7;
    public static final int IMAGE_SHAPE_FIELD_NUMBER = 5;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Background background_;
    private int bitField0_;
    private int color_;
    private Date date_;
    private boolean explicit_;
    private int imageShape_;
    private String title_ = "";
    private String description_ = "";
    private String imageUrl_ = "";

    static {
        ShareCard shareCard = new ShareCard();
        DEFAULT_INSTANCE = shareCard;
        AbstractC0269h.registerDefaultInstance(ShareCard.class, shareCard);
    }

    private ShareCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ShareCard m97997q(byte[] bArr) {
        return (ShareCard) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ȉ\u0005\f\u0006ဉ\u0000\u0007\u0007\bဉ\u0001", new Object[]{"bitField0_", "title_", "description_", "color_", "imageUrl_", "imageShape_", "date_", "explicit_", "background_"});
        }
        if (iOrdinal == 3) {
            return new ShareCard();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 3);
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
        synchronized (ShareCard.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final Background m97998n() {
        Background background = this.background_;
        return background == null ? Background.m97979o() : background;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Date m97999o() {
        Date date = this.date_;
        return date == null ? Date.m97985o() : date;
    }

    /* JADX INFO: renamed from: p */
    public final kc40 m98000p() {
        kc40 kc40Var;
        int i = this.imageShape_;
        if (i == 0) {
            kc40Var = kc40.IMAGE_SHAPE_UNKNOWN;
        } else if (i != 1) {
            kc40Var = i != 2 ? null : kc40.IMAGE_SHAPE_ROUND;
        } else {
            kc40Var = kc40.IMAGE_SHAPE_SQUARE;
        }
        return kc40Var == null ? kc40.UNRECOGNIZED : kc40Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
