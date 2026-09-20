package com.spotify.trackalternatives.p165v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class TrackAlternativeVersions extends AbstractC0269h implements sre0 {
    private static final TrackAlternativeVersions DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VERSION_GROUPS_FIELD_NUMBER = 1;
    private ae50 versionGroups_ = AbstractC0269h.emptyProtobufList();

    static {
        TrackAlternativeVersions trackAlternativeVersions = new TrackAlternativeVersions();
        DEFAULT_INSTANCE = trackAlternativeVersions;
        AbstractC0269h.registerDefaultInstance(TrackAlternativeVersions.class, trackAlternativeVersions);
    }

    private TrackAlternativeVersions() {
    }

    /* JADX INFO: renamed from: o */
    public static TrackAlternativeVersions m21823o(byte[] bArr) {
        return (TrackAlternativeVersions) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"versionGroups_", VersionGroup.class});
        }
        if (iOrdinal == 3) {
            return new TrackAlternativeVersions();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 10);
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
        synchronized (TrackAlternativeVersions.class) {
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
    public final ae50 m21824n() {
        return this.versionGroups_;
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
