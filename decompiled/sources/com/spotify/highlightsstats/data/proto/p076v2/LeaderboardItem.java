package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Person;
import p204p.ckc;
import p204p.dv50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class LeaderboardItem extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int CHANGE_PREVIOUS_PERIOD_FIELD_NUMBER = 6;
    private static final LeaderboardItem DEFAULT_INSTANCE;
    public static final int LISTENING_MINUTES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERSON_FIELD_NUMBER = 1;
    private int bitField0_;
    private int changePreviousPeriod_;
    private Person person_;
    private String listeningMinutes_ = "";
    private String accessibilityDescription_ = "";

    static {
        LeaderboardItem leaderboardItem = new LeaderboardItem();
        DEFAULT_INSTANCE = leaderboardItem;
        AbstractC0269h.registerDefaultInstance(LeaderboardItem.class, leaderboardItem);
    }

    private LeaderboardItem() {
    }

    /* JADX INFO: renamed from: p */
    public static LeaderboardItem m11552p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003Ȉ\u0005Ȉ\u0006ဌ\u0001", new Object[]{"bitField0_", "person_", "listeningMinutes_", "accessibilityDescription_", "changePreviousPeriod_"});
        }
        if (iOrdinal == 3) {
            return new LeaderboardItem();
        }
        if (iOrdinal == 4) {
            return new dv50(DEFAULT_INSTANCE, 20);
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
        synchronized (LeaderboardItem.class) {
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
    public final String m11553n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ckc m11554o() {
        ckc ckcVarM33113a = ckc.m33113a(this.changePreviousPeriod_);
        return ckcVarM33113a == null ? ckc.UNRECOGNIZED : ckcVarM33113a;
    }

    /* JADX INFO: renamed from: q */
    public final String m11555q() {
        return this.listeningMinutes_;
    }

    /* JADX INFO: renamed from: r */
    public final Person m11556r() {
        Person person = this.person_;
        return person == null ? Person.m11286n() : person;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11557s() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
