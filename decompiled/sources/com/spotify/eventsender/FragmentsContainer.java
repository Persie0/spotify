package com.spotify.eventsender;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.e900;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentsContainer extends AbstractC0269h implements sre0 {
    private static final FragmentsContainer DEFAULT_INSTANCE;
    public static final int FRAGMENT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 fragment_ = AbstractC0269h.emptyProtobufList();

    static {
        FragmentsContainer fragmentsContainer = new FragmentsContainer();
        DEFAULT_INSTANCE = fragmentsContainer;
        AbstractC0269h.registerDefaultInstance(FragmentsContainer.class, fragmentsContainer);
    }

    private FragmentsContainer() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9761n(FragmentsContainer fragmentsContainer, ArrayList arrayList) {
        ae50 ae50Var = fragmentsContainer.fragment_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            fragmentsContainer.fragment_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, fragmentsContainer.fragment_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9762o(FragmentsContainer fragmentsContainer, Fragment fragment) {
        fragmentsContainer.getClass();
        ae50 ae50Var = fragmentsContainer.fragment_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            fragmentsContainer.fragment_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        fragmentsContainer.fragment_.add(fragment);
    }

    /* JADX INFO: renamed from: p */
    public static FragmentsContainer m9763p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static e900 m9764r() {
        return (e900) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: s */
    public static FragmentsContainer m9765s(byte[] bArr) {
        return (FragmentsContainer) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fragment_", Fragment.class});
        }
        if (iOrdinal == 3) {
            return new FragmentsContainer();
        }
        if (iOrdinal == 4) {
            return new e900(DEFAULT_INSTANCE);
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
        synchronized (FragmentsContainer.class) {
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

    /* JADX INFO: renamed from: q */
    public final ae50 m9766q() {
        return this.fragment_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
