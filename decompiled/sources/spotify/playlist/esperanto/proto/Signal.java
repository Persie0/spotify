package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.l121;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Signal extends AbstractC0269h implements sre0 {
    public static final int CLIENT_PAYLOAD_FIELD_NUMBER = 3;
    private static final Signal DEFAULT_INSTANCE;
    public static final int FORCE_FIELD_NUMBER = 4;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int INSTANCE_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNAL_DATA_FIELD_NUMBER = 2;
    private gva clientPayload_;
    private boolean force_;
    private String identifier_ = "";
    private String instanceId_;
    private gva signalData_;

    static {
        Signal signal = new Signal();
        DEFAULT_INSTANCE = signal;
        AbstractC0269h.registerDefaultInstance(Signal.class, signal);
    }

    private Signal() {
        cva cvaVar = gva.f84678b;
        this.signalData_ = cvaVar;
        this.clientPayload_ = cvaVar;
        this.instanceId_ = "";
    }

    /* JADX INFO: renamed from: n */
    public static void m97782n(Signal signal, gva gvaVar) {
        signal.getClass();
        gvaVar.getClass();
        signal.clientPayload_ = gvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m97783o(Signal signal, boolean z) {
        signal.force_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m97784p(Signal signal, String str) {
        signal.getClass();
        str.getClass();
        signal.identifier_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97785q(Signal signal, gva gvaVar) {
        signal.getClass();
        gvaVar.getClass();
        signal.signalData_ = gvaVar;
    }

    /* JADX INFO: renamed from: r */
    public static l121 m97786r() {
        return (l121) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n\u0004\u0007\u0005Ȉ", new Object[]{"identifier_", "signalData_", "clientPayload_", "force_", "instanceId_"});
        }
        if (iOrdinal == 3) {
            return new Signal();
        }
        if (iOrdinal == 4) {
            return new l121(DEFAULT_INSTANCE);
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
        synchronized (Signal.class) {
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
