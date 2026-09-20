package spotify.show_cosmos.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowRequest$Response extends AbstractC0269h implements sre0 {
    public static final int AUXILIARY_SECTIONS_FIELD_NUMBER = 8;
    private static final ShowRequest$Response DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LENGTH_FIELD_NUMBER = 5;
    public static final int LOADING_CONTENTS_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int RANGE_OFFSET_FIELD_NUMBER = 10;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 4;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 7;
    private ShowRequest$AuxiliarySections auxiliarySections_;
    private int bitField0_;
    private ShowRequest$Header header_;
    private ae50 item_ = AbstractC0269h.emptyProtobufList();
    private int length_;
    private boolean loadingContents_;
    private int rangeOffset_;
    private int unfilteredLength_;
    private int unrangedLength_;

    static {
        ShowRequest$Response showRequest$Response = new ShowRequest$Response();
        DEFAULT_INSTANCE = showRequest$Response;
        AbstractC0269h.registerDefaultInstance(ShowRequest$Response.class, showRequest$Response);
    }

    private ShowRequest$Response() {
    }

    /* JADX INFO: renamed from: o */
    public static ShowRequest$Response m97948o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဇ\u0003\u0007ဋ\u0004\bဉ\u0005\nဋ\u0006", new Object[]{"bitField0_", "item_", ShowRequest$Item.class, "header_", "unfilteredLength_", "length_", "loadingContents_", "unrangedLength_", "auxiliarySections_", "rangeOffset_"});
        }
        if (iOrdinal == 3) {
            return new ShowRequest$Response();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 22);
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
        synchronized (ShowRequest$Response.class) {
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

    /* JADX INFO: renamed from: n */
    public final ShowRequest$AuxiliarySections m97949n() {
        ShowRequest$AuxiliarySections showRequest$AuxiliarySections = this.auxiliarySections_;
        return showRequest$AuxiliarySections == null ? ShowRequest$AuxiliarySections.m97923o() : showRequest$AuxiliarySections;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ShowRequest$Header m97950p() {
        ShowRequest$Header showRequest$Header = this.header_;
        return showRequest$Header == null ? ShowRequest$Header.m97932n() : showRequest$Header;
    }

    /* JADX INFO: renamed from: q */
    public final int m97951q() {
        return this.item_.size();
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m97952r() {
        return this.item_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m97953s() {
        return this.loadingContents_;
    }

    /* JADX INFO: renamed from: t */
    public final int m97954t() {
        return this.rangeOffset_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final int m97955u() {
        return this.unfilteredLength_;
    }

    /* JADX INFO: renamed from: v */
    public final int m97956v() {
        return this.unrangedLength_;
    }
}
