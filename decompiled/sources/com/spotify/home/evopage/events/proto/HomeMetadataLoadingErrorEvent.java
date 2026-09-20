package com.spotify.home.evopage.events.proto;

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

/* JADX INFO: loaded from: classes7.dex */
public final class HomeMetadataLoadingErrorEvent extends AbstractC0269h implements sre0 {
    private static final HomeMetadataLoadingErrorEvent DEFAULT_INSTANCE;
    public static final int FAILED_COUNT_FIELD_NUMBER = 6;
    public static final int FAILURES_FIELD_NUMBER = 4;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int IS_OFFLINE_FIELD_NUMBER = 2;
    public static final int LOADED_COUNT_FIELD_NUMBER = 5;
    public static final int NOT_READY_COUNT_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int TOTAL_FAILURE_COUNT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int failedCount_;
    private boolean isOffline_;
    private int loadedCount_;
    private int notReadyCount_;
    private int totalFailureCount_;
    private String feedId_ = "";
    private ae50 failures_ = AbstractC0269h.emptyProtobufList();

    public static final class Failures extends AbstractC0269h implements sre0 {
        private static final Failures DEFAULT_INSTANCE;
        public static final int ENTITY_URI_FIELD_NUMBER = 1;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
        public static final int EXTENSION_NAME_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private String entityUri_ = "";
        private String extensionName_ = "";
        private String errorMessage_ = "";

        static {
            Failures failures = new Failures();
            DEFAULT_INSTANCE = failures;
            AbstractC0269h.registerDefaultInstance(Failures.class, failures);
        }

        private Failures() {
        }

        /* JADX INFO: renamed from: n */
        public static void m11770n(Failures failures, String str) {
            failures.getClass();
            str.getClass();
            failures.bitField0_ |= 1;
            failures.entityUri_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m11771o(Failures failures, String str) {
            failures.getClass();
            str.getClass();
            failures.bitField0_ |= 4;
            failures.errorMessage_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m11772p(Failures failures, String str) {
            failures.getClass();
            str.getClass();
            failures.bitField0_ |= 2;
            failures.extensionName_ = str;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0783b m11773q() {
            return (C0783b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "entityUri_", "extensionName_", "errorMessage_"});
            }
            if (iOrdinal == 3) {
                return new Failures();
            }
            if (iOrdinal == 4) {
                return new C0783b(DEFAULT_INSTANCE);
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
            synchronized (Failures.class) {
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
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = new HomeMetadataLoadingErrorEvent();
        DEFAULT_INSTANCE = homeMetadataLoadingErrorEvent;
        AbstractC0269h.registerDefaultInstance(HomeMetadataLoadingErrorEvent.class, homeMetadataLoadingErrorEvent);
    }

    private HomeMetadataLoadingErrorEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11762n(HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent, ArrayList arrayList) {
        ae50 ae50Var = homeMetadataLoadingErrorEvent.failures_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            homeMetadataLoadingErrorEvent.failures_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, homeMetadataLoadingErrorEvent.failures_);
    }

    /* JADX INFO: renamed from: o */
    public static void m11763o(HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent, int i) {
        homeMetadataLoadingErrorEvent.bitField0_ |= 16;
        homeMetadataLoadingErrorEvent.failedCount_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m11764p(HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent, String str) {
        homeMetadataLoadingErrorEvent.getClass();
        str.getClass();
        homeMetadataLoadingErrorEvent.bitField0_ |= 1;
        homeMetadataLoadingErrorEvent.feedId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11765q(HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent, boolean z) {
        homeMetadataLoadingErrorEvent.bitField0_ |= 2;
        homeMetadataLoadingErrorEvent.isOffline_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m11766r(HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent, int i) {
        homeMetadataLoadingErrorEvent.bitField0_ |= 8;
        homeMetadataLoadingErrorEvent.loadedCount_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m11767s(HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent, int i) {
        homeMetadataLoadingErrorEvent.bitField0_ |= 32;
        homeMetadataLoadingErrorEvent.notReadyCount_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m11768t(HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent, int i) {
        homeMetadataLoadingErrorEvent.bitField0_ |= 4;
        homeMetadataLoadingErrorEvent.totalFailureCount_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static C0782a m11769u() {
        return (C0782a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004\u001b\u0005င\u0003\u0006င\u0004\u0007င\u0005", new Object[]{"bitField0_", "feedId_", "isOffline_", "totalFailureCount_", "failures_", Failures.class, "loadedCount_", "failedCount_", "notReadyCount_"});
        }
        if (iOrdinal == 3) {
            return new HomeMetadataLoadingErrorEvent();
        }
        if (iOrdinal == 4) {
            return new C0782a(DEFAULT_INSTANCE);
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
        synchronized (HomeMetadataLoadingErrorEvent.class) {
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
