package com.spotify.upcomingreleases.p172v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.ug90;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ListeningPartiesSection extends AbstractC0269h implements sre0 {
    private static final ListeningPartiesSection DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LISTENING_PARTIES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int id_;
    private ae50 listeningParties_ = AbstractC0269h.emptyProtobufList();

    static {
        ListeningPartiesSection listeningPartiesSection = new ListeningPartiesSection();
        DEFAULT_INSTANCE = listeningPartiesSection;
        AbstractC0269h.registerDefaultInstance(ListeningPartiesSection.class, listeningPartiesSection);
    }

    private ListeningPartiesSection() {
    }

    /* JADX INFO: renamed from: n */
    public static ListeningPartiesSection m22012n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"id_", "listeningParties_", ListeningParty.class});
        }
        if (iOrdinal == 3) {
            return new ListeningPartiesSection();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 23);
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
        synchronized (ListeningPartiesSection.class) {
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
    public final ug90 m22013o() {
        ug90 ug90Var;
        int i = this.id_;
        if (i != 0) {
            ug90Var = i != 1 ? null : ug90.ALL;
        } else {
            ug90Var = ug90.UNSPECIFIED;
        }
        return ug90Var == null ? ug90.UNRECOGNIZED : ug90Var;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m22014p() {
        return this.listeningParties_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
