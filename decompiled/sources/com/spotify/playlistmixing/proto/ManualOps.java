package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ManualOps extends AbstractC0269h implements sre0 {
    private static final ManualOps DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POSTOPS_FIELD_NUMBER = 2;
    public static final int PREOPS_FIELD_NUMBER = 1;
    private int bitField0_;
    private PostOps postOps_;
    private PreOps preOps_;

    public static final class Move extends AbstractC0269h implements sre0 {
        public static final int BEFORE_FIELD_NUMBER = 3;
        private static final Move DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SOURCEITEMID_FIELD_NUMBER = 1;
        public static final int TARGETITEMID_FIELD_NUMBER = 2;
        private boolean before_;
        private gva sourceItemId_;
        private gva targetItemId_;

        static {
            Move move = new Move();
            DEFAULT_INSTANCE = move;
            AbstractC0269h.registerDefaultInstance(Move.class, move);
        }

        private Move() {
            cva cvaVar = gva.f84678b;
            this.sourceItemId_ = cvaVar;
            this.targetItemId_ = cvaVar;
        }

        /* JADX INFO: renamed from: n */
        public static void m19409n(Move move, boolean z) {
            move.before_ = z;
        }

        /* JADX INFO: renamed from: o */
        public static void m19410o(Move move, cva cvaVar) {
            move.getClass();
            move.sourceItemId_ = cvaVar;
        }

        /* JADX INFO: renamed from: p */
        public static void m19411p(Move move, cva cvaVar) {
            move.getClass();
            move.targetItemId_ = cvaVar;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C1222b m19412q() {
            return (C1222b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0007", new Object[]{"sourceItemId_", "targetItemId_", "before_"});
            }
            if (iOrdinal == 3) {
                return new Move();
            }
            if (iOrdinal == 4) {
                return new C1222b(DEFAULT_INSTANCE);
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
            synchronized (Move.class) {
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

    /* JADX INFO: renamed from: com.spotify.playlistmixing.proto.ManualOps$Op */
    public static final class C1220Op extends AbstractC0269h implements sre0 {
        private static final C1220Op DEFAULT_INSTANCE;
        public static final int MOVE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int REMOVE_FIELD_NUMBER = 2;
        private int operationCase_ = 0;
        private Object operation_;

        static {
            C1220Op c1220Op = new C1220Op();
            DEFAULT_INSTANCE = c1220Op;
            AbstractC0269h.registerDefaultInstance(C1220Op.class, c1220Op);
        }

        private C1220Op() {
        }

        /* JADX INFO: renamed from: n */
        public static void m19413n(C1220Op c1220Op, Move move) {
            c1220Op.getClass();
            move.getClass();
            c1220Op.operation_ = move;
            c1220Op.operationCase_ = 1;
        }

        /* JADX INFO: renamed from: o */
        public static void m19414o(C1220Op c1220Op, Remove remove) {
            c1220Op.getClass();
            remove.getClass();
            c1220Op.operation_ = remove;
            c1220Op.operationCase_ = 2;
        }

        /* JADX INFO: renamed from: p */
        public static C1223c m19415p() {
            return (C1223c) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"operation_", "operationCase_", Move.class, Remove.class});
            }
            if (iOrdinal == 3) {
                return new C1220Op();
            }
            if (iOrdinal == 4) {
                return new C1223c(DEFAULT_INSTANCE);
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
            synchronized (C1220Op.class) {
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

    public static final class PostOps extends AbstractC0269h implements sre0 {
        private static final PostOps DEFAULT_INSTANCE;
        public static final int OPS_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private ae50 ops_ = AbstractC0269h.emptyProtobufList();

        static {
            PostOps postOps = new PostOps();
            DEFAULT_INSTANCE = postOps;
            AbstractC0269h.registerDefaultInstance(PostOps.class, postOps);
        }

        private PostOps() {
        }

        /* JADX INFO: renamed from: n */
        public static void m19416n(PostOps postOps, ArrayList arrayList) {
            ae50 ae50Var = postOps.ops_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                postOps.ops_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(arrayList, postOps.ops_);
        }

        /* JADX INFO: renamed from: o */
        public static C1224d m19417o() {
            return (C1224d) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"ops_", C1220Op.class});
            }
            if (iOrdinal == 3) {
                return new PostOps();
            }
            if (iOrdinal == 4) {
                return new C1224d(DEFAULT_INSTANCE);
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
            synchronized (PostOps.class) {
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

    public static final class PreOps extends AbstractC0269h implements sre0 {
        private static final PreOps DEFAULT_INSTANCE;
        public static final int OPS_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private ae50 ops_ = AbstractC0269h.emptyProtobufList();

        static {
            PreOps preOps = new PreOps();
            DEFAULT_INSTANCE = preOps;
            AbstractC0269h.registerDefaultInstance(PreOps.class, preOps);
        }

        private PreOps() {
        }

        /* JADX INFO: renamed from: n */
        public static void m19418n(PreOps preOps, ArrayList arrayList) {
            ae50 ae50Var = preOps.ops_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                preOps.ops_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(arrayList, preOps.ops_);
        }

        /* JADX INFO: renamed from: o */
        public static C1225e m19419o() {
            return (C1225e) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"ops_", C1220Op.class});
            }
            if (iOrdinal == 3) {
                return new PreOps();
            }
            if (iOrdinal == 4) {
                return new C1225e(DEFAULT_INSTANCE);
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
            synchronized (PreOps.class) {
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

    public static final class Remove extends AbstractC0269h implements sre0 {
        private static final Remove DEFAULT_INSTANCE;
        public static final int ITEMID_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private gva itemId_ = gva.f84678b;

        static {
            Remove remove = new Remove();
            DEFAULT_INSTANCE = remove;
            AbstractC0269h.registerDefaultInstance(Remove.class, remove);
        }

        private Remove() {
        }

        /* JADX INFO: renamed from: n */
        public static void m19420n(Remove remove, cva cvaVar) {
            remove.getClass();
            remove.itemId_ = cvaVar;
        }

        /* JADX INFO: renamed from: o */
        public static C1226f m19421o() {
            return (C1226f) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"itemId_"});
            }
            if (iOrdinal == 3) {
                return new Remove();
            }
            if (iOrdinal == 4) {
                return new C1226f(DEFAULT_INSTANCE);
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
            synchronized (Remove.class) {
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
        ManualOps manualOps = new ManualOps();
        DEFAULT_INSTANCE = manualOps;
        AbstractC0269h.registerDefaultInstance(ManualOps.class, manualOps);
    }

    private ManualOps() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19406n(ManualOps manualOps, PostOps postOps) {
        manualOps.getClass();
        postOps.getClass();
        manualOps.postOps_ = postOps;
        manualOps.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m19407o(ManualOps manualOps, PreOps preOps) {
        manualOps.getClass();
        preOps.getClass();
        manualOps.preOps_ = preOps;
        manualOps.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static C1221a m19408p() {
        return (C1221a) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "preOps_", "postOps_"});
        }
        if (iOrdinal == 3) {
            return new ManualOps();
        }
        if (iOrdinal == 4) {
            return new C1221a(DEFAULT_INSTANCE);
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
        synchronized (ManualOps.class) {
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
