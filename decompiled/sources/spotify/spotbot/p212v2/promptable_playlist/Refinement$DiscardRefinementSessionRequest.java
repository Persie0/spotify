package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tnv0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Refinement$DiscardRefinementSessionRequest extends AbstractC0269h implements sre0 {
    private static final Refinement$DiscardRefinementSessionRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTBOT_URI_FIELD_NUMBER = 1;
    private String spotbotUri_ = "";

    static {
        Refinement$DiscardRefinementSessionRequest refinement$DiscardRefinementSessionRequest = new Refinement$DiscardRefinementSessionRequest();
        DEFAULT_INSTANCE = refinement$DiscardRefinementSessionRequest;
        AbstractC0269h.registerDefaultInstance(Refinement$DiscardRefinementSessionRequest.class, refinement$DiscardRefinementSessionRequest);
    }

    private Refinement$DiscardRefinementSessionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98053n(Refinement$DiscardRefinementSessionRequest refinement$DiscardRefinementSessionRequest, String str) {
        refinement$DiscardRefinementSessionRequest.getClass();
        str.getClass();
        refinement$DiscardRefinementSessionRequest.spotbotUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static tnv0 m98054o() {
        return (tnv0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"spotbotUri_"});
        }
        if (iOrdinal == 3) {
            return new Refinement$DiscardRefinementSessionRequest();
        }
        if (iOrdinal == 4) {
            return new tnv0(DEFAULT_INSTANCE);
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
        synchronized (Refinement$DiscardRefinementSessionRequest.class) {
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
