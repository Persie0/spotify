package com.spotify.prereleases.extension;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes9.dex */
public final class Entity extends AbstractC0269h implements sre0 {
    public static final int AGENTS_FIELD_NUMBER = 4;
    public static final int COPYRIGHT_FIELD_NUMBER = 7;
    public static final int COVERS_FIELD_NUMBER = 5;
    private static final Entity DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean explicit_;
    private String uri_ = "";
    private String type_ = "";
    private String name_ = "";
    private ae50 agents_ = AbstractC0269h.emptyProtobufList();
    private ae50 covers_ = AbstractC0269h.emptyProtobufList();
    private ae50 copyright_ = AbstractC0269h.emptyProtobufList();

    static {
        Entity entity = new Entity();
        DEFAULT_INSTANCE = entity;
        AbstractC0269h.registerDefaultInstance(Entity.class, entity);
    }

    private Entity() {
    }

    /* JADX INFO: renamed from: o */
    public static Entity m19745o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004\u001b\u0005\u001b\u0006ဇ\u0001\u0007\u001b", new Object[]{"bitField0_", "uri_", "type_", "name_", "agents_", Agent.class, "covers_", Image.class, "explicit_", "copyright_", Copyright.class});
        }
        if (iOrdinal == 3) {
            return new Entity();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 15);
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
        synchronized (Entity.class) {
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

    public final List getAgentsList() {
        return this.agents_;
    }

    public final List getCopyrightList() {
        return this.copyright_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m19746n() {
        return this.covers_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m19747p() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: q */
    public final String m19748q() {
        return this.type_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
