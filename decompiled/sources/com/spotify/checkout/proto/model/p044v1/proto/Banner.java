package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.gt8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class Banner extends AbstractC0269h implements sre0 {
    public static final int COLORSET_FIELD_NUMBER = 2;
    private static final Banner DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int MESSAGES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String header_ = "";
    private String colorSet_ = "";
    private ae50 messages_ = AbstractC0269h.emptyProtobufList();

    static {
        Banner banner = new Banner();
        DEFAULT_INSTANCE = banner;
        AbstractC0269h.registerDefaultInstance(Banner.class, banner);
    }

    private Banner() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5935n(Banner banner, Iterable iterable) {
        ae50 ae50Var = banner.messages_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            banner.messages_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, banner.messages_);
    }

    /* JADX INFO: renamed from: o */
    public static void m5936o(Banner banner) {
        banner.getClass();
        banner.colorSet_ = "positive";
    }

    /* JADX INFO: renamed from: p */
    public static void m5937p(Banner banner) {
        banner.getClass();
        banner.bitField0_ |= 1;
        banner.header_ = "Banner header";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static Banner m5938r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static gt8 m5939t() {
        return (gt8) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002Ȉ\u0003Ț", new Object[]{"bitField0_", "header_", "colorSet_", "messages_"});
        }
        if (iOrdinal == 3) {
            return new Banner();
        }
        if (iOrdinal == 4) {
            return new gt8(DEFAULT_INSTANCE);
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
        synchronized (Banner.class) {
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

    public final List getMessagesList() {
        return this.messages_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final String m5940q() {
        return this.colorSet_;
    }

    /* JADX INFO: renamed from: s */
    public final String m5941s() {
        return this.header_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
