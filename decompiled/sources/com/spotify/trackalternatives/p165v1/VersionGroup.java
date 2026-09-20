package com.spotify.trackalternatives.p165v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.h2b1;
import p204p.k0w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class VersionGroup extends AbstractC0269h implements sre0 {
    private static final VersionGroup DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RELATIONSHIP_TYPE_FIELD_NUMBER = 1;
    public static final int TRACKS_FIELD_NUMBER = 2;
    private int relationshipType_;
    private ae50 tracks_ = AbstractC0269h.emptyProtobufList();

    static {
        VersionGroup versionGroup = new VersionGroup();
        DEFAULT_INSTANCE = versionGroup;
        AbstractC0269h.registerDefaultInstance(VersionGroup.class, versionGroup);
    }

    private VersionGroup() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"relationshipType_", "tracks_", VersionTrack.class});
        }
        if (iOrdinal == 3) {
            return new VersionGroup();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 25);
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
        synchronized (VersionGroup.class) {
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

    public final List getTracksList() {
        return this.tracks_;
    }

    /* JADX INFO: renamed from: n */
    public final k0w0 m21825n() {
        k0w0 k0w0Var;
        int i = this.relationshipType_;
        if (i == 0) {
            k0w0Var = k0w0.RELATIONSHIP_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            k0w0Var = k0w0.REMIX;
        } else if (i == 2) {
            k0w0Var = k0w0.EXTENDED;
        } else if (i != 3) {
            k0w0Var = i != 4 ? null : k0w0.LIVE;
        } else {
            k0w0Var = k0w0.COVER;
        }
        return k0w0Var == null ? k0w0.UNRECOGNIZED : k0w0Var;
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
