package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ChatEventType extends AbstractC0269h implements ChatEventTypeOrBuilder {
    public static final int CREATE_EVENT_FIELD_NUMBER = 1;
    private static final ChatEventType DEFAULT_INSTANCE;
    public static final int INVITE_LINK_FIELD_NUMBER = 9;
    public static final int JOIN_EVENT_FIELD_NUMBER = 3;
    public static final int LEAVE_EVENT_FIELD_NUMBER = 4;
    public static final int NAME_CHANGE_FIELD_NUMBER = 5;
    public static final int NEW_ADMIN_EVENT_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PHOTO_CHANGE_FIELD_NUMBER = 7;
    public static final int REMOVE_USER_FIELD_NUMBER = 8;
    public static final int REPORT_CHAT_EVENT_FIELD_NUMBER = 10;
    public static final int USER_INVITE_FIELD_NUMBER = 2;
    private int cetCase_ = 0;
    private Object cet_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ChatEventType$1 */
    public static /* synthetic */ class C03391 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3167xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3167xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3167xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3167xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3167xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3167xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3167xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3167xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ChatEventTypeOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearCet() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearCet();
            return this;
        }

        public Builder clearCreateEvent() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearCreateEvent();
            return this;
        }

        public Builder clearInviteLink() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearInviteLink();
            return this;
        }

        public Builder clearJoinEvent() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearJoinEvent();
            return this;
        }

        public Builder clearLeaveEvent() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearLeaveEvent();
            return this;
        }

        public Builder clearNameChange() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearNameChange();
            return this;
        }

        public Builder clearNewAdminEvent() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearNewAdminEvent();
            return this;
        }

        public Builder clearPhotoChange() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearPhotoChange();
            return this;
        }

        public Builder clearRemoveUser() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearRemoveUser();
            return this;
        }

        public Builder clearReportChatEvent() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearReportChatEvent();
            return this;
        }

        public Builder clearUserInvite() {
            copyOnWrite();
            ((ChatEventType) this.instance).clearUserInvite();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public CetCase getCetCase() {
            return ((ChatEventType) this.instance).getCetCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public CreateEvent getCreateEvent() {
            return ((ChatEventType) this.instance).getCreateEvent();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public InviteLinkEvent getInviteLink() {
            return ((ChatEventType) this.instance).getInviteLink();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public JoinEvent getJoinEvent() {
            return ((ChatEventType) this.instance).getJoinEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public LeaveEvent getLeaveEvent() {
            return ((ChatEventType) this.instance).getLeaveEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public NameChangeEvent getNameChange() {
            return ((ChatEventType) this.instance).getNameChange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public NewAdminEvent getNewAdminEvent() {
            return ((ChatEventType) this.instance).getNewAdminEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public PhotoChangeEvent getPhotoChange() {
            return ((ChatEventType) this.instance).getPhotoChange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public RemoveUserEvent getRemoveUser() {
            return ((ChatEventType) this.instance).getRemoveUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public ReportChatEvent getReportChatEvent() {
            return ((ChatEventType) this.instance).getReportChatEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public InviteEvent getUserInvite() {
            return ((ChatEventType) this.instance).getUserInvite();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasCreateEvent() {
            return ((ChatEventType) this.instance).hasCreateEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasInviteLink() {
            return ((ChatEventType) this.instance).hasInviteLink();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasJoinEvent() {
            return ((ChatEventType) this.instance).hasJoinEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasLeaveEvent() {
            return ((ChatEventType) this.instance).hasLeaveEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasNameChange() {
            return ((ChatEventType) this.instance).hasNameChange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasNewAdminEvent() {
            return ((ChatEventType) this.instance).hasNewAdminEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasPhotoChange() {
            return ((ChatEventType) this.instance).hasPhotoChange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasRemoveUser() {
            return ((ChatEventType) this.instance).hasRemoveUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasReportChatEvent() {
            return ((ChatEventType) this.instance).hasReportChatEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasUserInvite() {
            return ((ChatEventType) this.instance).hasUserInvite();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCreateEvent(CreateEvent createEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeCreateEvent(createEvent);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeInviteLink(InviteLinkEvent inviteLinkEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeInviteLink(inviteLinkEvent);
            return this;
        }

        public Builder mergeJoinEvent(JoinEvent joinEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeJoinEvent(joinEvent);
            return this;
        }

        public Builder mergeLeaveEvent(LeaveEvent leaveEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeLeaveEvent(leaveEvent);
            return this;
        }

        public Builder mergeNameChange(NameChangeEvent nameChangeEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeNameChange(nameChangeEvent);
            return this;
        }

        public Builder mergeNewAdminEvent(NewAdminEvent newAdminEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeNewAdminEvent(newAdminEvent);
            return this;
        }

        public Builder mergePhotoChange(PhotoChangeEvent photoChangeEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergePhotoChange(photoChangeEvent);
            return this;
        }

        public Builder mergeRemoveUser(RemoveUserEvent removeUserEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeRemoveUser(removeUserEvent);
            return this;
        }

        public Builder mergeReportChatEvent(ReportChatEvent reportChatEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeReportChatEvent(reportChatEvent);
            return this;
        }

        public Builder mergeUserInvite(InviteEvent inviteEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).mergeUserInvite(inviteEvent);
            return this;
        }

        public Builder setCreateEvent(CreateEvent createEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setCreateEvent(createEvent);
            return this;
        }

        public Builder setInviteLink(InviteLinkEvent inviteLinkEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setInviteLink(inviteLinkEvent);
            return this;
        }

        public Builder setJoinEvent(JoinEvent joinEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setJoinEvent(joinEvent);
            return this;
        }

        public Builder setLeaveEvent(LeaveEvent leaveEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setLeaveEvent(leaveEvent);
            return this;
        }

        public Builder setNameChange(NameChangeEvent nameChangeEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setNameChange(nameChangeEvent);
            return this;
        }

        public Builder setNewAdminEvent(NewAdminEvent newAdminEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setNewAdminEvent(newAdminEvent);
            return this;
        }

        public Builder setPhotoChange(PhotoChangeEvent photoChangeEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setPhotoChange(photoChangeEvent);
            return this;
        }

        public Builder setRemoveUser(RemoveUserEvent removeUserEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setRemoveUser(removeUserEvent);
            return this;
        }

        public Builder setReportChatEvent(ReportChatEvent reportChatEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setReportChatEvent(reportChatEvent);
            return this;
        }

        public Builder setUserInvite(InviteEvent inviteEvent) {
            copyOnWrite();
            ((ChatEventType) this.instance).setUserInvite(inviteEvent);
            return this;
        }

        private Builder() {
            super(ChatEventType.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setCreateEvent(CreateEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setCreateEvent((CreateEvent) builder.build());
            return this;
        }

        public Builder setInviteLink(InviteLinkEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setInviteLink((InviteLinkEvent) builder.build());
            return this;
        }

        public Builder setJoinEvent(JoinEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setJoinEvent((JoinEvent) builder.build());
            return this;
        }

        public Builder setLeaveEvent(LeaveEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setLeaveEvent((LeaveEvent) builder.build());
            return this;
        }

        public Builder setNameChange(NameChangeEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setNameChange((NameChangeEvent) builder.build());
            return this;
        }

        public Builder setNewAdminEvent(NewAdminEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setNewAdminEvent((NewAdminEvent) builder.build());
            return this;
        }

        public Builder setPhotoChange(PhotoChangeEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setPhotoChange((PhotoChangeEvent) builder.build());
            return this;
        }

        public Builder setRemoveUser(RemoveUserEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setRemoveUser((RemoveUserEvent) builder.build());
            return this;
        }

        public Builder setReportChatEvent(ReportChatEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setReportChatEvent((ReportChatEvent) builder.build());
            return this;
        }

        public Builder setUserInvite(InviteEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) this.instance).setUserInvite((InviteEvent) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    public enum CetCase {
        CREATE_EVENT(1),
        USER_INVITE(2),
        JOIN_EVENT(3),
        LEAVE_EVENT(4),
        NAME_CHANGE(5),
        NEW_ADMIN_EVENT(6),
        PHOTO_CHANGE(7),
        REMOVE_USER(8),
        INVITE_LINK(9),
        REPORT_CHAT_EVENT(10),
        CET_NOT_SET(0);

        private final int value;

        CetCase(int i) {
            this.value = i;
        }

        public static CetCase forNumber(int i) {
            switch (i) {
                case 0:
                    return CET_NOT_SET;
                case 1:
                    return CREATE_EVENT;
                case 2:
                    return USER_INVITE;
                case 3:
                    return JOIN_EVENT;
                case 4:
                    return LEAVE_EVENT;
                case 5:
                    return NAME_CHANGE;
                case 6:
                    return NEW_ADMIN_EVENT;
                case 7:
                    return PHOTO_CHANGE;
                case 8:
                    return REMOVE_USER;
                case 9:
                    return INVITE_LINK;
                case 10:
                    return REPORT_CHAT_EVENT;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CetCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ChatEventType chatEventType = new ChatEventType();
        DEFAULT_INSTANCE = chatEventType;
        AbstractC0269h.registerDefaultInstance(ChatEventType.class, chatEventType);
    }

    private ChatEventType() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCet() {
        this.cetCase_ = 0;
        this.cet_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateEvent() {
        if (this.cetCase_ == 1) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInviteLink() {
        if (this.cetCase_ == 9) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinEvent() {
        if (this.cetCase_ == 3) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeaveEvent() {
        if (this.cetCase_ == 4) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameChange() {
        if (this.cetCase_ == 5) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAdminEvent() {
        if (this.cetCase_ == 6) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhotoChange() {
        if (this.cetCase_ == 7) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveUser() {
        if (this.cetCase_ == 8) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportChatEvent() {
        if (this.cetCase_ == 10) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInvite() {
        if (this.cetCase_ == 2) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    public static ChatEventType getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateEvent(CreateEvent createEvent) {
        createEvent.getClass();
        if (this.cetCase_ != 1 || this.cet_ == CreateEvent.getDefaultInstance()) {
            this.cet_ = createEvent;
        } else {
            this.cet_ = ((CreateEvent.Builder) CreateEvent.newBuilder((CreateEvent) this.cet_).mergeFrom((AbstractC0269h) createEvent)).buildPartial();
        }
        this.cetCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInviteLink(InviteLinkEvent inviteLinkEvent) {
        inviteLinkEvent.getClass();
        if (this.cetCase_ != 9 || this.cet_ == InviteLinkEvent.getDefaultInstance()) {
            this.cet_ = inviteLinkEvent;
        } else {
            this.cet_ = ((InviteLinkEvent.Builder) InviteLinkEvent.newBuilder((InviteLinkEvent) this.cet_).mergeFrom((AbstractC0269h) inviteLinkEvent)).buildPartial();
        }
        this.cetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJoinEvent(JoinEvent joinEvent) {
        joinEvent.getClass();
        if (this.cetCase_ != 3 || this.cet_ == JoinEvent.getDefaultInstance()) {
            this.cet_ = joinEvent;
        } else {
            this.cet_ = ((JoinEvent.Builder) JoinEvent.newBuilder((JoinEvent) this.cet_).mergeFrom((AbstractC0269h) joinEvent)).buildPartial();
        }
        this.cetCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLeaveEvent(LeaveEvent leaveEvent) {
        leaveEvent.getClass();
        if (this.cetCase_ != 4 || this.cet_ == LeaveEvent.getDefaultInstance()) {
            this.cet_ = leaveEvent;
        } else {
            this.cet_ = ((LeaveEvent.Builder) LeaveEvent.newBuilder((LeaveEvent) this.cet_).mergeFrom((AbstractC0269h) leaveEvent)).buildPartial();
        }
        this.cetCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNameChange(NameChangeEvent nameChangeEvent) {
        nameChangeEvent.getClass();
        if (this.cetCase_ != 5 || this.cet_ == NameChangeEvent.getDefaultInstance()) {
            this.cet_ = nameChangeEvent;
        } else {
            this.cet_ = ((NameChangeEvent.Builder) NameChangeEvent.newBuilder((NameChangeEvent) this.cet_).mergeFrom((AbstractC0269h) nameChangeEvent)).buildPartial();
        }
        this.cetCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewAdminEvent(NewAdminEvent newAdminEvent) {
        newAdminEvent.getClass();
        if (this.cetCase_ != 6 || this.cet_ == NewAdminEvent.getDefaultInstance()) {
            this.cet_ = newAdminEvent;
        } else {
            this.cet_ = ((NewAdminEvent.Builder) NewAdminEvent.newBuilder((NewAdminEvent) this.cet_).mergeFrom((AbstractC0269h) newAdminEvent)).buildPartial();
        }
        this.cetCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePhotoChange(PhotoChangeEvent photoChangeEvent) {
        photoChangeEvent.getClass();
        if (this.cetCase_ != 7 || this.cet_ == PhotoChangeEvent.getDefaultInstance()) {
            this.cet_ = photoChangeEvent;
        } else {
            this.cet_ = ((PhotoChangeEvent.Builder) PhotoChangeEvent.newBuilder((PhotoChangeEvent) this.cet_).mergeFrom((AbstractC0269h) photoChangeEvent)).buildPartial();
        }
        this.cetCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveUser(RemoveUserEvent removeUserEvent) {
        removeUserEvent.getClass();
        if (this.cetCase_ != 8 || this.cet_ == RemoveUserEvent.getDefaultInstance()) {
            this.cet_ = removeUserEvent;
        } else {
            this.cet_ = ((RemoveUserEvent.Builder) RemoveUserEvent.newBuilder((RemoveUserEvent) this.cet_).mergeFrom((AbstractC0269h) removeUserEvent)).buildPartial();
        }
        this.cetCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportChatEvent(ReportChatEvent reportChatEvent) {
        reportChatEvent.getClass();
        if (this.cetCase_ != 10 || this.cet_ == ReportChatEvent.getDefaultInstance()) {
            this.cet_ = reportChatEvent;
        } else {
            this.cet_ = ((ReportChatEvent.Builder) ReportChatEvent.newBuilder((ReportChatEvent) this.cet_).mergeFrom((AbstractC0269h) reportChatEvent)).buildPartial();
        }
        this.cetCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInvite(InviteEvent inviteEvent) {
        inviteEvent.getClass();
        if (this.cetCase_ != 2 || this.cet_ == InviteEvent.getDefaultInstance()) {
            this.cet_ = inviteEvent;
        } else {
            this.cet_ = ((InviteEvent.Builder) InviteEvent.newBuilder((InviteEvent) this.cet_).mergeFrom((AbstractC0269h) inviteEvent)).buildPartial();
        }
        this.cetCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatEventType parseDelimitedFrom(InputStream inputStream) {
        return (ChatEventType) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatEventType parseFrom(ByteBuffer byteBuffer) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateEvent(CreateEvent createEvent) {
        createEvent.getClass();
        this.cet_ = createEvent;
        this.cetCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInviteLink(InviteLinkEvent inviteLinkEvent) {
        inviteLinkEvent.getClass();
        this.cet_ = inviteLinkEvent;
        this.cetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinEvent(JoinEvent joinEvent) {
        joinEvent.getClass();
        this.cet_ = joinEvent;
        this.cetCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeaveEvent(LeaveEvent leaveEvent) {
        leaveEvent.getClass();
        this.cet_ = leaveEvent;
        this.cetCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameChange(NameChangeEvent nameChangeEvent) {
        nameChangeEvent.getClass();
        this.cet_ = nameChangeEvent;
        this.cetCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAdminEvent(NewAdminEvent newAdminEvent) {
        newAdminEvent.getClass();
        this.cet_ = newAdminEvent;
        this.cetCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhotoChange(PhotoChangeEvent photoChangeEvent) {
        photoChangeEvent.getClass();
        this.cet_ = photoChangeEvent;
        this.cetCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveUser(RemoveUserEvent removeUserEvent) {
        removeUserEvent.getClass();
        this.cet_ = removeUserEvent;
        this.cetCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportChatEvent(ReportChatEvent reportChatEvent) {
        reportChatEvent.getClass();
        this.cet_ = reportChatEvent;
        this.cetCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInvite(InviteEvent inviteEvent) {
        inviteEvent.getClass();
        this.cet_ = inviteEvent;
        this.cetCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"cet_", "cetCase_", CreateEvent.class, InviteEvent.class, JoinEvent.class, LeaveEvent.class, NameChangeEvent.class, NewAdminEvent.class, PhotoChangeEvent.class, RemoveUserEvent.class, InviteLinkEvent.class, ReportChatEvent.class});
        }
        if (iOrdinal == 3) {
            return new ChatEventType();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (ChatEventType.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public CetCase getCetCase() {
        return CetCase.forNumber(this.cetCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public CreateEvent getCreateEvent() {
        return this.cetCase_ == 1 ? (CreateEvent) this.cet_ : CreateEvent.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public InviteLinkEvent getInviteLink() {
        return this.cetCase_ == 9 ? (InviteLinkEvent) this.cet_ : InviteLinkEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public JoinEvent getJoinEvent() {
        return this.cetCase_ == 3 ? (JoinEvent) this.cet_ : JoinEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public LeaveEvent getLeaveEvent() {
        return this.cetCase_ == 4 ? (LeaveEvent) this.cet_ : LeaveEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public NameChangeEvent getNameChange() {
        return this.cetCase_ == 5 ? (NameChangeEvent) this.cet_ : NameChangeEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public NewAdminEvent getNewAdminEvent() {
        return this.cetCase_ == 6 ? (NewAdminEvent) this.cet_ : NewAdminEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public PhotoChangeEvent getPhotoChange() {
        return this.cetCase_ == 7 ? (PhotoChangeEvent) this.cet_ : PhotoChangeEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public RemoveUserEvent getRemoveUser() {
        return this.cetCase_ == 8 ? (RemoveUserEvent) this.cet_ : RemoveUserEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public ReportChatEvent getReportChatEvent() {
        return this.cetCase_ == 10 ? (ReportChatEvent) this.cet_ : ReportChatEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public InviteEvent getUserInvite() {
        return this.cetCase_ == 2 ? (InviteEvent) this.cet_ : InviteEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasCreateEvent() {
        return this.cetCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasInviteLink() {
        return this.cetCase_ == 9;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasJoinEvent() {
        return this.cetCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasLeaveEvent() {
        return this.cetCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasNameChange() {
        return this.cetCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasNewAdminEvent() {
        return this.cetCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasPhotoChange() {
        return this.cetCase_ == 7;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasRemoveUser() {
        return this.cetCase_ == 8;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasReportChatEvent() {
        return this.cetCase_ == 10;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasUserInvite() {
        return this.cetCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ChatEventType chatEventType) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatEventType);
    }

    public static ChatEventType parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ChatEventType) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ChatEventType parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ChatEventType parseFrom(gva gvaVar) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ChatEventType parseFrom(gva gvaVar, aux auxVar) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ChatEventType parseFrom(byte[] bArr) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatEventType parseFrom(byte[] bArr, aux auxVar) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ChatEventType parseFrom(InputStream inputStream) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatEventType parseFrom(InputStream inputStream, aux auxVar) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ChatEventType parseFrom(owe oweVar) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ChatEventType parseFrom(owe oweVar, aux auxVar) {
        return (ChatEventType) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
