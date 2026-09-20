package spotify.party.orchestra.p209v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qtx0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Rsvp$GetRsvpStatusResponse extends AbstractC0269h implements sre0 {
    private static final Rsvp$GetRsvpStatusResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        Rsvp$GetRsvpStatusResponse rsvp$GetRsvpStatusResponse = new Rsvp$GetRsvpStatusResponse();
        DEFAULT_INSTANCE = rsvp$GetRsvpStatusResponse;
        AbstractC0269h.registerDefaultInstance(Rsvp$GetRsvpStatusResponse.class, rsvp$GetRsvpStatusResponse);
    }

    private Rsvp$GetRsvpStatusResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new Rsvp$GetRsvpStatusResponse();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 8);
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
        synchronized (Rsvp$GetRsvpStatusResponse.class) {
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
    public final qtx0 m97642n() {
        qtx0 qtx0Var;
        int i = this.status_;
        if (i == 0) {
            qtx0Var = qtx0.UNRECOGNIZED_STATUS;
        } else if (i != 1) {
            qtx0Var = i != 2 ? null : qtx0.RSVPED;
        } else {
            qtx0Var = qtx0.NOT_RSVPED;
        }
        return qtx0Var == null ? qtx0.UNRECOGNIZED : qtx0Var;
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
