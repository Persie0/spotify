package com.spotify.rcs.resolver.grpc.p141v0;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Context extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final Context DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 context_ = AbstractC0269h.emptyProtobufList();

    public static final class ContextEntry extends AbstractC0269h implements sre0 {
        public static final int BOOL_VALUE_FIELD_NUMBER = 11;
        private static final ContextEntry DEFAULT_INSTANCE;
        public static final int LONG_VALUE_FIELD_NUMBER = 12;
        private static volatile r2n0 PARSER = null;
        public static final int POLICY_INPUT_NAME_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 10;
        private Object context_;
        private Object val_;
        private int contextCase_ = 0;
        private int valCase_ = 0;

        static {
            ContextEntry contextEntry = new ContextEntry();
            DEFAULT_INSTANCE = contextEntry;
            AbstractC0269h.registerDefaultInstance(ContextEntry.class, contextEntry);
        }

        private ContextEntry() {
        }

        /* JADX INFO: renamed from: n */
        public static void m20139n(ContextEntry contextEntry, boolean z) {
            contextEntry.valCase_ = 11;
            contextEntry.val_ = Boolean.valueOf(z);
        }

        /* JADX INFO: renamed from: o */
        public static void m20140o(ContextEntry contextEntry, String str) {
            contextEntry.getClass();
            str.getClass();
            contextEntry.contextCase_ = 2;
            contextEntry.context_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m20141p(ContextEntry contextEntry, String str) {
            contextEntry.getClass();
            str.getClass();
            contextEntry.valCase_ = 10;
            contextEntry.val_ = str;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C1275i m20142q() {
            return (C1275i) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0002\u0000\u0002\f\u0004\u0000\u0000\u0000\u0002Ȼ\u0000\nȻ\u0001\u000b:\u0001\f5\u0001", new Object[]{"context_", "contextCase_", "val_", "valCase_"});
            }
            if (iOrdinal == 3) {
                return new ContextEntry();
            }
            if (iOrdinal == 4) {
                return new C1275i(DEFAULT_INSTANCE);
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
            synchronized (ContextEntry.class) {
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        AbstractC0269h.registerDefaultInstance(Context.class, context);
    }

    private Context() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20137n(Context context, ArrayList arrayList) {
        ae50 ae50Var = context.context_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            context.context_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, context.context_);
    }

    /* JADX INFO: renamed from: o */
    public static C1274h m20138o() {
        return (C1274h) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"context_", ContextEntry.class});
        }
        if (iOrdinal == 3) {
            return new Context();
        }
        if (iOrdinal == 4) {
            return new C1274h(DEFAULT_INSTANCE);
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
        synchronized (Context.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
