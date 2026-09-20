package com.spotify.messageorchestration.logger;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.pse0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageOrchestrationPrepareForPresentationRequest extends AbstractC0269h implements sre0 {
    private static final MessageOrchestrationPrepareForPresentationRequest DEFAULT_INSTANCE;
    public static final int NECESSITY_FIELD_NUMBER = 3;
    public static final int PAGE_URI_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PRESENTED_NECESSITIES_FIELD_NUMBER = 6;
    public static final int PRESENTED_SOURCES_FIELD_NUMBER = 5;
    public static final int PRESENTED_TYPES_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 2;
    public static final int TIME_SINCE_APP_START_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long timeSinceAppStart_;
    private String type_ = "";
    private String source_ = "";
    private String necessity_ = "";
    private ae50 presentedTypes_ = AbstractC0269h.emptyProtobufList();
    private ae50 presentedSources_ = AbstractC0269h.emptyProtobufList();
    private ae50 presentedNecessities_ = AbstractC0269h.emptyProtobufList();
    private String pageUri_ = "";

    static {
        MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest = new MessageOrchestrationPrepareForPresentationRequest();
        DEFAULT_INSTANCE = messageOrchestrationPrepareForPresentationRequest;
        AbstractC0269h.registerDefaultInstance(MessageOrchestrationPrepareForPresentationRequest.class, messageOrchestrationPrepareForPresentationRequest);
    }

    private MessageOrchestrationPrepareForPresentationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13482n(MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest, ArrayList arrayList) {
        ae50 ae50Var = messageOrchestrationPrepareForPresentationRequest.presentedNecessities_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            messageOrchestrationPrepareForPresentationRequest.presentedNecessities_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, messageOrchestrationPrepareForPresentationRequest.presentedNecessities_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13483o(MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest, ArrayList arrayList) {
        ae50 ae50Var = messageOrchestrationPrepareForPresentationRequest.presentedSources_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            messageOrchestrationPrepareForPresentationRequest.presentedSources_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, messageOrchestrationPrepareForPresentationRequest.presentedSources_);
    }

    /* JADX INFO: renamed from: p */
    public static void m13484p(MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest, ArrayList arrayList) {
        ae50 ae50Var = messageOrchestrationPrepareForPresentationRequest.presentedTypes_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            messageOrchestrationPrepareForPresentationRequest.presentedTypes_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, messageOrchestrationPrepareForPresentationRequest.presentedTypes_);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13485q(MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest, String str) {
        messageOrchestrationPrepareForPresentationRequest.getClass();
        messageOrchestrationPrepareForPresentationRequest.bitField0_ |= 4;
        messageOrchestrationPrepareForPresentationRequest.necessity_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13486r(MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest, String str) {
        messageOrchestrationPrepareForPresentationRequest.getClass();
        messageOrchestrationPrepareForPresentationRequest.bitField0_ |= 8;
        messageOrchestrationPrepareForPresentationRequest.pageUri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13487s(MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest, String str) {
        messageOrchestrationPrepareForPresentationRequest.getClass();
        messageOrchestrationPrepareForPresentationRequest.bitField0_ |= 2;
        messageOrchestrationPrepareForPresentationRequest.source_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13488t(MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest, long j) {
        messageOrchestrationPrepareForPresentationRequest.bitField0_ |= 16;
        messageOrchestrationPrepareForPresentationRequest.timeSinceAppStart_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m13489u(MessageOrchestrationPrepareForPresentationRequest messageOrchestrationPrepareForPresentationRequest, String str) {
        messageOrchestrationPrepareForPresentationRequest.getClass();
        messageOrchestrationPrepareForPresentationRequest.bitField0_ |= 1;
        messageOrchestrationPrepareForPresentationRequest.type_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static pse0 m13490v() {
        return (pse0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0006\u001a\u0007ဈ\u0003\bဂ\u0004", new Object[]{"bitField0_", "type_", "source_", "necessity_", "presentedTypes_", "presentedSources_", "presentedNecessities_", "pageUri_", "timeSinceAppStart_"});
        }
        if (iOrdinal == 3) {
            return new MessageOrchestrationPrepareForPresentationRequest();
        }
        if (iOrdinal == 4) {
            return new pse0(DEFAULT_INSTANCE);
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
        synchronized (MessageOrchestrationPrepareForPresentationRequest.class) {
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
