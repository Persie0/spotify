package com.spotify.kidsdatamigration.p085v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x5f0;
import p204p.z110;
import p204p.zdf0;

/* JADX INFO: loaded from: classes7.dex */
public final class MigrationStatusPubsub extends AbstractC0269h implements sre0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final MigrationStatusPubsub DEFAULT_INSTANCE;
    public static final int MIGRATION_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String childId_ = "";
    private String migrationId_ = "";
    private int status_;

    static {
        MigrationStatusPubsub migrationStatusPubsub = new MigrationStatusPubsub();
        DEFAULT_INSTANCE = migrationStatusPubsub;
        AbstractC0269h.registerDefaultInstance(MigrationStatusPubsub.class, migrationStatusPubsub);
    }

    private MigrationStatusPubsub() {
    }

    /* JADX INFO: renamed from: o */
    public static MigrationStatusPubsub m12168o(byte[] bArr) {
        return (MigrationStatusPubsub) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002\f\u0003Ȉ", new Object[]{"bitField0_", "childId_", "status_", "migrationId_"});
        }
        if (iOrdinal == 3) {
            return new MigrationStatusPubsub();
        }
        if (iOrdinal == 4) {
            return new x5f0(DEFAULT_INSTANCE, 21);
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
        synchronized (MigrationStatusPubsub.class) {
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

    public final String getChildId() {
        return this.childId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getMigrationId() {
        return this.migrationId_;
    }

    /* JADX INFO: renamed from: n */
    public final zdf0 m12169n() {
        zdf0 zdf0Var;
        int i = this.status_;
        if (i == 0) {
            zdf0Var = zdf0.STATUS_UNSPECIFIED;
        } else if (i == 1) {
            zdf0Var = zdf0.STATUS_STARTED;
        } else if (i != 2) {
            zdf0Var = i != 3 ? null : zdf0.STATUS_FAILED;
        } else {
            zdf0Var = zdf0.STATUS_FINISHED;
        }
        return zdf0Var == null ? zdf0.UNRECOGNIZED : zdf0Var;
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
