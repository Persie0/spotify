package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.ae50;
import p204p.c8s0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Promptableplaylist$Status extends AbstractC0269h implements sre0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Promptableplaylist$Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int code_;
    private String message_ = "";
    private ae50 details_ = AbstractC0269h.emptyProtobufList();

    static {
        Promptableplaylist$Status promptableplaylist$Status = new Promptableplaylist$Status();
        DEFAULT_INSTANCE = promptableplaylist$Status;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$Status.class, promptableplaylist$Status);
    }

    private Promptableplaylist$Status() {
    }

    /* JADX INFO: renamed from: o */
    public static Promptableplaylist$Status m98043o(byte[] bArr) {
        return (Promptableplaylist$Status) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", Any.class});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$Status();
        }
        if (iOrdinal == 4) {
            return new c8s0(DEFAULT_INSTANCE, 21);
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
        synchronized (Promptableplaylist$Status.class) {
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

    /* JADX INFO: renamed from: n */
    public final ae50 m98044n() {
        return this.details_;
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
