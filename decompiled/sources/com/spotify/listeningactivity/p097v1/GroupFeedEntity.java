package com.spotify.listeningactivity.p097v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupFeedEntity extends AbstractC0269h implements sre0 {
    public static final int CONVERSATION_URI_FIELD_NUMBER = 2;
    private static final GroupFeedEntity DEFAULT_INSTANCE;
    public static final int MEMBERS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String name_ = "";
    private String conversationUri_ = "";
    private ae50 members_ = AbstractC0269h.emptyProtobufList();

    static {
        GroupFeedEntity groupFeedEntity = new GroupFeedEntity();
        DEFAULT_INSTANCE = groupFeedEntity;
        AbstractC0269h.registerDefaultInstance(GroupFeedEntity.class, groupFeedEntity);
    }

    private GroupFeedEntity() {
    }

    /* JADX INFO: renamed from: o */
    public static GroupFeedEntity m12947o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "conversationUri_", "members_", GroupMember.class});
        }
        if (iOrdinal == 3) {
            return new GroupFeedEntity();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 13);
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
        synchronized (GroupFeedEntity.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m12948n() {
        return this.conversationUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m12949p() {
        return this.members_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
