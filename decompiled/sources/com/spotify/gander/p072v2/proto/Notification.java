package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ksj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Notification extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int CREATED_TIMESTAMP_FIELD_NUMBER = 2;
    private static final Notification DEFAULT_INSTANCE;
    public static final int ENTITY_IMAGE_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_NEW_FIELD_NUMBER = 8;
    public static final int MESSAGING_METADATA_FIELD_NUMBER = 10;
    public static final int MULTI_USER_IMAGE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int STORAGE_ID_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int USER_AND_ENTITY_IMAGE_FIELD_NUMBER = 7;
    private NotificationAction action_;
    private int bitField0_;
    private Timestamp createdTimestamp_;
    private Object image_;
    private boolean isNew_;
    private MessagingMetadata messagingMetadata_;
    private int imageCase_ = 0;
    private String id_ = "";
    private String title_ = "";
    private String storageId_ = "";

    static {
        Notification notification = new Notification();
        DEFAULT_INSTANCE = notification;
        AbstractC0269h.registerDefaultInstance(Notification.class, notification);
    }

    private Notification() {
    }

    /* JADX INFO: renamed from: H */
    public static ksj0 m11085H() {
        return (ksj0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m11086n(Notification notification, NotificationAction notificationAction) {
        notification.getClass();
        notificationAction.getClass();
        notification.action_ = notificationAction;
        notification.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m11087o(Notification notification, Timestamp timestamp) {
        notification.getClass();
        timestamp.getClass();
        notification.createdTimestamp_ = timestamp;
        notification.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m11088p(Notification notification, EntityImage entityImage) {
        notification.getClass();
        entityImage.getClass();
        notification.image_ = entityImage;
        notification.imageCase_ = 6;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11089q(Notification notification, String str) {
        notification.getClass();
        notification.id_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m11090r(Notification notification, boolean z) {
        notification.isNew_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m11091s(Notification notification, MessagingMetadata messagingMetadata) {
        notification.getClass();
        messagingMetadata.getClass();
        notification.messagingMetadata_ = messagingMetadata;
        notification.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: t */
    public static void m11092t(Notification notification, MultiUserImage multiUserImage) {
        notification.getClass();
        multiUserImage.getClass();
        notification.image_ = multiUserImage;
        notification.imageCase_ = 5;
    }

    /* JADX INFO: renamed from: u */
    public static void m11093u(Notification notification, String str) {
        notification.getClass();
        notification.storageId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m11094v(Notification notification, String str) {
        notification.getClass();
        notification.title_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m11095w(Notification notification, UserAndEntityImage userAndEntityImage) {
        notification.getClass();
        userAndEntityImage.getClass();
        notification.image_ = userAndEntityImage;
        notification.imageCase_ = 7;
    }

    /* JADX INFO: renamed from: A */
    public final int m11096A() {
        int i = this.imageCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 5) {
            return 1;
        }
        if (i != 6) {
            return i != 7 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: B */
    public final MessagingMetadata m11097B() {
        MessagingMetadata messagingMetadata = this.messagingMetadata_;
        return messagingMetadata == null ? MessagingMetadata.m11078p() : messagingMetadata;
    }

    /* JADX INFO: renamed from: C */
    public final MultiUserImage m11098C() {
        return this.imageCase_ == 5 ? (MultiUserImage) this.image_ : MultiUserImage.m11082o();
    }

    /* JADX INFO: renamed from: D */
    public final String m11099D() {
        return this.storageId_;
    }

    /* JADX INFO: renamed from: E */
    public final UserAndEntityImage m11100E() {
        return this.imageCase_ == 7 ? (UserAndEntityImage) this.image_ : UserAndEntityImage.m11140p();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m11101F() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m11102G() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\nဉ\u0002", new Object[]{"image_", "imageCase_", "bitField0_", "id_", "createdTimestamp_", "title_", "action_", MultiUserImage.class, EntityImage.class, UserAndEntityImage.class, "isNew_", "storageId_", "messagingMetadata_"});
        }
        if (iOrdinal == 3) {
            return new Notification();
        }
        if (iOrdinal == 4) {
            return new ksj0(DEFAULT_INSTANCE);
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
        synchronized (Notification.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final boolean getIsNew() {
        return this.isNew_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: x */
    public final NotificationAction m11103x() {
        NotificationAction notificationAction = this.action_;
        return notificationAction == null ? NotificationAction.m11108p() : notificationAction;
    }

    /* JADX INFO: renamed from: y */
    public final Timestamp m11104y() {
        Timestamp timestamp = this.createdTimestamp_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: z */
    public final EntityImage m11105z() {
        return this.imageCase_ == 6 ? (EntityImage) this.image_ : EntityImage.m11073p();
    }
}
