package spotify.show_cosmos.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.g6f0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vq11;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowRequest$NextBestEpisodeSection extends AbstractC0269h implements sre0 {
    private static final ShowRequest$NextBestEpisodeSection DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ShowRequest$Item item_;
    private int label_;

    static {
        ShowRequest$NextBestEpisodeSection showRequest$NextBestEpisodeSection = new ShowRequest$NextBestEpisodeSection();
        DEFAULT_INSTANCE = showRequest$NextBestEpisodeSection;
        AbstractC0269h.registerDefaultInstance(ShowRequest$NextBestEpisodeSection.class, showRequest$NextBestEpisodeSection);
    }

    private ShowRequest$NextBestEpisodeSection() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowRequest$NextBestEpisodeSection m97945n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "label_", g6f0.f77039l, "item_"});
        }
        if (iOrdinal == 3) {
            return new ShowRequest$NextBestEpisodeSection();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 21);
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
        synchronized (ShowRequest$NextBestEpisodeSection.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShowRequest$Item m97946o() {
        ShowRequest$Item showRequest$Item = this.item_;
        return showRequest$Item == null ? ShowRequest$Item.m97938n() : showRequest$Item;
    }

    /* JADX INFO: renamed from: p */
    public final vq11 m97947p() {
        vq11 vq11VarM86180a = vq11.m86180a(this.label_);
        return vq11VarM86180a == null ? vq11.UNKNOWN : vq11VarM86180a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
