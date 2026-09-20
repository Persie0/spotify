package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.snv0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Refinement$AttachRefinementSessionRequest extends AbstractC0269h implements sre0 {
    private static final Refinement$AttachRefinementSessionRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTBOT_URI_FIELD_NUMBER = 1;
    private String spotbotUri_ = "";
    private String messageId_ = "";

    static {
        Refinement$AttachRefinementSessionRequest refinement$AttachRefinementSessionRequest = new Refinement$AttachRefinementSessionRequest();
        DEFAULT_INSTANCE = refinement$AttachRefinementSessionRequest;
        AbstractC0269h.registerDefaultInstance(Refinement$AttachRefinementSessionRequest.class, refinement$AttachRefinementSessionRequest);
    }

    private Refinement$AttachRefinementSessionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98049n(Refinement$AttachRefinementSessionRequest refinement$AttachRefinementSessionRequest, String str) {
        refinement$AttachRefinementSessionRequest.getClass();
        str.getClass();
        refinement$AttachRefinementSessionRequest.messageId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m98050o(Refinement$AttachRefinementSessionRequest refinement$AttachRefinementSessionRequest, String str) {
        refinement$AttachRefinementSessionRequest.getClass();
        str.getClass();
        refinement$AttachRefinementSessionRequest.spotbotUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static snv0 m98051p() {
        return (snv0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"spotbotUri_", "messageId_"});
        }
        if (iOrdinal == 3) {
            return new Refinement$AttachRefinementSessionRequest();
        }
        if (iOrdinal == 4) {
            return new snv0(DEFAULT_INSTANCE);
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
        synchronized (Refinement$AttachRefinementSessionRequest.class) {
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
