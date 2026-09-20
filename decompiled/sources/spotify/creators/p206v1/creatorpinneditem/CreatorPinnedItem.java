package spotify.creators.p206v1.creatorpinneditem;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CreatorPinnedItem extends AbstractC0269h implements sre0 {
    public static final int BACKGROUNDIMAGE_FIELD_NUMBER = 13;
    public static final int CHECKOUTURL_FIELD_NUMBER = 15;
    public static final int COMMENT_FIELD_NUMBER = 7;
    public static final int CONCERTDATE_FIELD_NUMBER = 10;
    public static final int CONCERTLOCATION_FIELD_NUMBER = 12;
    public static final int CONCERTTIME_FIELD_NUMBER = 9;
    public static final int CONCERTURI_FIELD_NUMBER = 8;
    public static final int CONCERTVENUE_FIELD_NUMBER = 11;
    private static final CreatorPinnedItem DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SECONDSTOEXPIRATION_FIELD_NUMBER = 14;
    public static final int SUBTITLEURI_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp concertTime_;
    private long secondsToExpiration_;
    private String type_ = "";
    private String uri_ = "";
    private String title_ = "";
    private String image_ = "";
    private String subtitle_ = "";
    private String subtitleUri_ = "";
    private String comment_ = "";
    private String concertUri_ = "";
    private String concertDate_ = "";
    private String concertVenue_ = "";
    private String concertLocation_ = "";
    private String backgroundImage_ = "";
    private String checkoutUrl_ = "";

    static {
        CreatorPinnedItem creatorPinnedItem = new CreatorPinnedItem();
        DEFAULT_INSTANCE = creatorPinnedItem;
        AbstractC0269h.registerDefaultInstance(CreatorPinnedItem.class, creatorPinnedItem);
    }

    private CreatorPinnedItem() {
    }

    /* JADX INFO: renamed from: A */
    public static CreatorPinnedItem m97583A(byte[] bArr) {
        return (CreatorPinnedItem) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0000\nȈ\u000bȈ\fȈ\rȈ\u000eဂ\u0001\u000fȈ", new Object[]{"bitField0_", "type_", "uri_", "title_", "image_", "subtitle_", "subtitleUri_", "comment_", "concertUri_", "concertTime_", "concertDate_", "concertVenue_", "concertLocation_", "backgroundImage_", "secondsToExpiration_", "checkoutUrl_"});
        }
        if (iOrdinal == 3) {
            return new CreatorPinnedItem();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 15);
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
        synchronized (CreatorPinnedItem.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m97584n() {
        return this.backgroundImage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m97585o() {
        return this.checkoutUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m97586p() {
        return this.comment_;
    }

    /* JADX INFO: renamed from: q */
    public final String m97587q() {
        return this.concertDate_;
    }

    /* JADX INFO: renamed from: r */
    public final String m97588r() {
        return this.concertLocation_;
    }

    /* JADX INFO: renamed from: s */
    public final Timestamp m97589s() {
        Timestamp timestamp = this.concertTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: t */
    public final String m97590t() {
        return this.concertUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m97591u() {
        return this.concertVenue_;
    }

    /* JADX INFO: renamed from: v */
    public final String m97592v() {
        return this.image_;
    }

    /* JADX INFO: renamed from: w */
    public final long m97593w() {
        return this.secondsToExpiration_;
    }

    /* JADX INFO: renamed from: x */
    public final String m97594x() {
        return this.subtitleUri_;
    }

    /* JADX INFO: renamed from: y */
    public final String m97595y() {
        return this.type_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m97596z() {
        return (this.bitField0_ & 2) != 0;
    }
}
