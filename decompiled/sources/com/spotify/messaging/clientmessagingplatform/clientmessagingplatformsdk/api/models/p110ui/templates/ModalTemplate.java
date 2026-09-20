package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Disclaimer$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText$$serializer;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.c7h0;
import p204p.edo;
import p204p.eh00;
import p204p.ei6;
import p204p.fr0;
import p204p.fr70;
import p204p.hmk0;
import p204p.hrh;
import p204p.jqv0;
import p204p.ktz0;
import p204p.lau;
import p204p.q3d0;
import p204p.qe70;
import p204p.qoy0;
import p204p.qpv0;
import p204p.rr60;
import p204p.rtz0;
import p204p.up60;
import p204p.utz0;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "<init>", "()V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;Lp/hrh;Lp/ktz0;)V", "Companion", "Undefined", "BasicModal", "BaseModal", "JitModal", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BaseModal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$JitModal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$Undefined;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class ModalTemplate implements MessageTemplate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final fr70 $cachedSerializer$delegate = q3d0.m72078I(2, Companion.C09511.INSTANCE);

    @Metadata(m24211d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bu\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b7\u00108Jp\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b>\u0010#J\u001a\u0010B\u001a\u00020A2\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010.R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\bJ\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bM\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bQ\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u00108¨\u0006V"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BaseModal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "background", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "secondaryButton", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "disclaimer", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;", "accessoryContentSize", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;", "contentAlignment", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BaseModal;Lp/hrh;Lp/ktz0;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component4", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component6", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "component8", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;", "component9", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BaseModal;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "getBackground", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getSecondaryButton", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "getDisclaimer", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;", "getAccessoryContentSize", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;", "getContentAlignment", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class BaseModal extends ModalTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final AccessoryContentSize accessoryContentSize;
        private final BackgroundColor background;
        private final MessageText body;
        private final ContentAlignment contentAlignment;
        private final Disclaimer disclaimer;
        private final MessageText headline;
        private final Button primaryButton;
        private final Button secondaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BaseModal> CREATOR = new Creator();
        private static final fr70[] $childSerializers = {q3d0.m72078I(2, ModalTemplate$BaseModal$Companion$$childSerializers$1.INSTANCE), q3d0.m72078I(2, ModalTemplate$BaseModal$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null, q3d0.m72078I(2, ModalTemplate$BaseModal$Companion$$childSerializers$3.INSTANCE), q3d0.m72078I(2, ModalTemplate$BaseModal$Companion$$childSerializers$4.INSTANCE)};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BaseModal$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BaseModal;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return ModalTemplate$BaseModal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<BaseModal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseModal createFromParcel(Parcel parcel) {
                BackgroundColor backgroundColor = (BackgroundColor) parcel.readParcelable(BaseModal.class.getClassLoader());
                AccessoryContent accessoryContent = (AccessoryContent) parcel.readParcelable(BaseModal.class.getClassLoader());
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                MessageText messageTextCreateFromParcel = creator.createFromParcel(parcel);
                MessageText messageTextCreateFromParcel2 = creator.createFromParcel(parcel);
                Parcelable.Creator<Button> creator2 = Button.CREATOR;
                return new BaseModal(backgroundColor, accessoryContent, messageTextCreateFromParcel, messageTextCreateFromParcel2, creator2.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel), parcel.readInt() != 0 ? Disclaimer.CREATOR.createFromParcel(parcel) : null, AccessoryContentSize.CREATOR.createFromParcel(parcel), ContentAlignment.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseModal[] newArray(int i) {
                return new BaseModal[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BaseModal(int i, BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment, utz0 utz0Var) {
            super(i, utz0Var);
            if (511 != (i & 511)) {
                edo.m38617p(i, 511, ModalTemplate$BaseModal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.background = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.headline = messageText;
            this.body = messageText2;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.disclaimer = disclaimer;
            this.accessoryContentSize = accessoryContentSize;
            this.contentAlignment = contentAlignment;
        }

        public static /* synthetic */ BaseModal copy$default(BaseModal baseModal, BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment, int i, Object obj) {
            if ((i & 1) != 0) {
                backgroundColor = baseModal.background;
            }
            if ((i & 2) != 0) {
                accessoryContent = baseModal.accessoryContent;
            }
            if ((i & 4) != 0) {
                messageText = baseModal.headline;
            }
            if ((i & 8) != 0) {
                messageText2 = baseModal.body;
            }
            if ((i & 16) != 0) {
                button = baseModal.primaryButton;
            }
            if ((i & 32) != 0) {
                button2 = baseModal.secondaryButton;
            }
            if ((i & 64) != 0) {
                disclaimer = baseModal.disclaimer;
            }
            if ((i & 128) != 0) {
                accessoryContentSize = baseModal.accessoryContentSize;
            }
            if ((i & 256) != 0) {
                contentAlignment = baseModal.contentAlignment;
            }
            AccessoryContentSize accessoryContentSize2 = accessoryContentSize;
            ContentAlignment contentAlignment2 = contentAlignment;
            Button button3 = button2;
            Disclaimer disclaimer2 = disclaimer;
            Button button4 = button;
            MessageText messageText3 = messageText;
            return baseModal.copy(backgroundColor, accessoryContent, messageText3, messageText2, button4, button3, disclaimer2, accessoryContentSize2, contentAlignment2);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15215x4f8ee6e9(BaseModal self, hrh output, ktz0 serialDesc) {
            ModalTemplate.write$Self(self, output, serialDesc);
            fr70[] fr70VarArr = $childSerializers;
            output.mo44941k(serialDesc, 0, (rr60) fr70VarArr[0].getValue(), self.background);
            output.mo44943s(serialDesc, 1, (rr60) fr70VarArr[1].getValue(), self.accessoryContent);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.mo44941k(serialDesc, 2, messageText$$serializer, self.headline);
            output.mo44941k(serialDesc, 3, messageText$$serializer, self.body);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.mo44941k(serialDesc, 4, button$$serializer, self.primaryButton);
            output.mo44943s(serialDesc, 5, button$$serializer, self.secondaryButton);
            output.mo44943s(serialDesc, 6, Disclaimer$$serializer.INSTANCE, self.disclaimer);
            output.mo44941k(serialDesc, 7, (rr60) fr70VarArr[7].getValue(), self.accessoryContentSize);
            output.mo44941k(serialDesc, 8, (rr60) fr70VarArr[8].getValue(), self.contentAlignment);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BackgroundColor getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessageText getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageText getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final AccessoryContentSize getAccessoryContentSize() {
            return this.accessoryContentSize;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final ContentAlignment getContentAlignment() {
            return this.contentAlignment;
        }

        public final BaseModal copy(BackgroundColor background, AccessoryContent accessoryContent, MessageText headline, MessageText body, Button primaryButton, Button secondaryButton, Disclaimer disclaimer, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment) {
            return new BaseModal(background, accessoryContent, headline, body, primaryButton, secondaryButton, disclaimer, accessoryContentSize, contentAlignment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseModal)) {
                return false;
            }
            BaseModal baseModal = (BaseModal) other;
            return wj50.m88271j(this.background, baseModal.background) && wj50.m88271j(this.accessoryContent, baseModal.accessoryContent) && wj50.m88271j(this.headline, baseModal.headline) && wj50.m88271j(this.body, baseModal.body) && wj50.m88271j(this.primaryButton, baseModal.primaryButton) && wj50.m88271j(this.secondaryButton, baseModal.secondaryButton) && wj50.m88271j(this.disclaimer, baseModal.disclaimer) && this.accessoryContentSize == baseModal.accessoryContentSize && this.contentAlignment == baseModal.contentAlignment;
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final AccessoryContentSize getAccessoryContentSize() {
            return this.accessoryContentSize;
        }

        public final BackgroundColor getBackground() {
            return this.background;
        }

        public final MessageText getBody() {
            return this.body;
        }

        public final ContentAlignment getContentAlignment() {
            return this.contentAlignment;
        }

        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        public final MessageText getHeadline() {
            return this.headline;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public int hashCode() {
            int iHashCode = this.background.hashCode() * 31;
            AccessoryContent accessoryContent = this.accessoryContent;
            int iHashCode2 = (this.primaryButton.hashCode() + ei6.m39071h(this.body, ei6.m39071h(this.headline, (iHashCode + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31, 31), 31)) * 31;
            Button button = this.secondaryButton;
            int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
            Disclaimer disclaimer = this.disclaimer;
            int iHashCode4 = disclaimer != null ? disclaimer.hashCode() : 0;
            return this.contentAlignment.hashCode() + ((this.accessoryContentSize.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.background, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            this.headline.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
            this.primaryButton.writeToParcel(dest, flags);
            Button button = this.secondaryButton;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, flags);
            }
            Disclaimer disclaimer = this.disclaimer;
            if (disclaimer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                disclaimer.writeToParcel(dest, flags);
            }
            this.accessoryContentSize.writeToParcel(dest, flags);
            this.contentAlignment.writeToParcel(dest, flags);
        }

        public BaseModal(BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment) {
            super(null);
            this.background = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.headline = messageText;
            this.body = messageText2;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.disclaimer = disclaimer;
            this.accessoryContentSize = accessoryContentSize;
            this.contentAlignment = contentAlignment;
        }
    }

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate$Companion$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09511 extends qe70 implements eh00 {
            public static final C09511 INSTANCE = new C09511();

            public C09511() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                jqv0 jqv0Var = qpv0.f191387a;
                return new qoy0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate", jqv0Var.mo54112b(ModalTemplate.class), new up60[]{jqv0Var.mo54112b(BaseModal.class), jqv0Var.mo54112b(BasicModal.class), jqv0Var.mo54112b(JitModal.class), jqv0Var.mo54112b(Undefined.class)}, new rr60[]{ModalTemplate$BaseModal$$serializer.INSTANCE, ModalTemplate$BasicModal$$serializer.INSTANCE, ModalTemplate$JitModal$$serializer.INSTANCE, new hmk0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate.Undefined", Undefined.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ rr60 get$cachedSerializer() {
            return (rr60) ModalTemplate.$cachedSerializer$delegate.getValue();
        }

        public final rr60 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(m24211d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\"¨\u00061"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$JitModal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "", "htmlString", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$JitModal;Lp/hrh;Lp/ktz0;)V", "write$Self", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$JitModal;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHtmlString", "Ljava/util/List;", "getButtons", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class JitModal extends ModalTemplate {
        public static final int $stable = 0;
        private final List<Button> buttons;
        private final String htmlString;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<JitModal> CREATOR = new Creator();
        private static final fr70[] $childSerializers = {null, q3d0.m72078I(2, ModalTemplate$JitModal$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$JitModal$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$JitModal;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return ModalTemplate$JitModal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<JitModal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JitModal createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(Button.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new JitModal(string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JitModal[] newArray(int i) {
                return new JitModal[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public JitModal() {
            this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JitModal copy$default(JitModal jitModal, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jitModal.htmlString;
            }
            if ((i & 2) != 0) {
                list = jitModal.buttons;
            }
            return jitModal.copy(str, list);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15217x4f8ee6e9(JitModal self, hrh output, ktz0 serialDesc) {
            ModalTemplate.write$Self(self, output, serialDesc);
            fr70[] fr70VarArr = $childSerializers;
            if (output.mo48399d0() || !wj50.m88271j(self.htmlString, "")) {
                output.mo44931G(serialDesc, 0, self.htmlString);
            }
            if (!output.mo48399d0() && wj50.m88271j(self.buttons, lau.f131415a)) {
                return;
            }
            output.mo44941k(serialDesc, 1, (rr60) fr70VarArr[1].getValue(), self.buttons);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHtmlString() {
            return this.htmlString;
        }

        public final List<Button> component2() {
            return this.buttons;
        }

        public final JitModal copy(String htmlString, List<Button> buttons) {
            return new JitModal(htmlString, buttons);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JitModal)) {
                return false;
            }
            JitModal jitModal = (JitModal) other;
            return wj50.m88271j(this.htmlString, jitModal.htmlString) && wj50.m88271j(this.buttons, jitModal.buttons);
        }

        public final List<Button> getButtons() {
            return this.buttons;
        }

        public final String getHtmlString() {
            return this.htmlString;
        }

        public int hashCode() {
            return this.buttons.hashCode() + (this.htmlString.hashCode() * 31);
        }

        public String toString() {
            return "JitModal(htmlString=htmlString, buttons=" + this.buttons + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.htmlString);
            Iterator itM42468l = fr0.m42468l(dest, this.buttons);
            while (itM42468l.hasNext()) {
                ((Button) itM42468l.next()).writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ JitModal(int i, String str, List list, utz0 utz0Var) {
            super(i, utz0Var);
            this.htmlString = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.buttons = lau.f131415a;
            } else {
                this.buttons = list;
            }
        }

        public JitModal(String str, List<Button> list) {
            super(null);
            this.htmlString = str;
            this.buttons = list;
        }

        public /* synthetic */ JitModal(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? lau.f131415a : list);
        }
    }

    @rtz0
    @Metadata(m24211d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0006J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$Undefined;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lp/rr60;", "serializer", "()Lp/rr60;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Undefined extends ModalTemplate {
        public static final int $stable = 0;
        public static final Undefined INSTANCE = new Undefined();
        public static final Parcelable.Creator<Undefined> CREATOR = new Creator();
        private static final /* synthetic */ fr70 $cachedSerializer$delegate = q3d0.m72078I(2, C09521.INSTANCE);

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate$Undefined$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09521 extends qe70 implements eh00 {
            public static final C09521 INSTANCE = new C09521();

            public C09521() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                return new hmk0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate.Undefined", Undefined.INSTANCE, new Annotation[0]);
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<Undefined> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Undefined createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Undefined.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Undefined[] newArray(int i) {
                return new Undefined[i];
            }
        }

        private Undefined() {
            super(null);
        }

        private final /* synthetic */ rr60 get$cachedSerializer() {
            return (rr60) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Undefined);
        }

        public int hashCode() {
            return -24558377;
        }

        public final rr60 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Undefined";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }
    }

    public /* synthetic */ ModalTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ModalTemplate() {
    }

    public /* synthetic */ ModalTemplate(int i, utz0 utz0Var) {
    }

    @Metadata(m24211d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u00102J^\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b8\u0010 J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bB\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u00102¨\u0006M"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "backgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;", "accessoryContentSize", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;", "contentAlignment", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal;Lp/hrh;Lp/ktz0;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component6", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "getBackgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContentSize;", "getAccessoryContentSize", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ContentAlignment;", "getContentAlignment", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class BasicModal extends ModalTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final AccessoryContentSize accessoryContentSize;
        private final BackgroundColor backgroundColor;
        private final MessageText body;
        private final ContentAlignment contentAlignment;
        private final MessageText headline;
        private final Button primaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BasicModal> CREATOR = new Creator();
        private static final fr70[] $childSerializers = {q3d0.m72078I(2, ModalTemplate$BasicModal$Companion$$childSerializers$1.INSTANCE), null, null, q3d0.m72078I(2, ModalTemplate$BasicModal$Companion$$childSerializers$2.INSTANCE), null, q3d0.m72078I(2, ModalTemplate$BasicModal$Companion$$childSerializers$3.INSTANCE), q3d0.m72078I(2, ModalTemplate$BasicModal$Companion$$childSerializers$4.INSTANCE)};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return ModalTemplate$BasicModal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<BasicModal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BasicModal createFromParcel(Parcel parcel) {
                return new BasicModal((BackgroundColor) parcel.readParcelable(BasicModal.class.getClassLoader()), parcel.readInt() == 0 ? null : MessageText.CREATOR.createFromParcel(parcel), MessageText.CREATOR.createFromParcel(parcel), (AccessoryContent) parcel.readParcelable(BasicModal.class.getClassLoader()), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null, AccessoryContentSize.CREATOR.createFromParcel(parcel), ContentAlignment.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BasicModal[] newArray(int i) {
                return new BasicModal[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BasicModal(int i, BackgroundColor backgroundColor, MessageText messageText, MessageText messageText2, AccessoryContent accessoryContent, Button button, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment, utz0 utz0Var) {
            super(i, utz0Var);
            if (31 != (i & 31)) {
                edo.m38617p(i, 31, ModalTemplate$BasicModal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.backgroundColor = backgroundColor;
            this.headline = messageText;
            this.body = messageText2;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            if ((i & 32) == 0) {
                this.accessoryContentSize = AccessoryContentSize.UNKNOWN;
            } else {
                this.accessoryContentSize = accessoryContentSize;
            }
            if ((i & 64) == 0) {
                this.contentAlignment = ContentAlignment.UNKNOWN;
            } else {
                this.contentAlignment = contentAlignment;
            }
        }

        public static /* synthetic */ BasicModal copy$default(BasicModal basicModal, BackgroundColor backgroundColor, MessageText messageText, MessageText messageText2, AccessoryContent accessoryContent, Button button, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment, int i, Object obj) {
            if ((i & 1) != 0) {
                backgroundColor = basicModal.backgroundColor;
            }
            if ((i & 2) != 0) {
                messageText = basicModal.headline;
            }
            if ((i & 4) != 0) {
                messageText2 = basicModal.body;
            }
            if ((i & 8) != 0) {
                accessoryContent = basicModal.accessoryContent;
            }
            if ((i & 16) != 0) {
                button = basicModal.primaryButton;
            }
            if ((i & 32) != 0) {
                accessoryContentSize = basicModal.accessoryContentSize;
            }
            if ((i & 64) != 0) {
                contentAlignment = basicModal.contentAlignment;
            }
            AccessoryContentSize accessoryContentSize2 = accessoryContentSize;
            ContentAlignment contentAlignment2 = contentAlignment;
            Button button2 = button;
            MessageText messageText3 = messageText2;
            return basicModal.copy(backgroundColor, messageText, messageText3, accessoryContent, button2, accessoryContentSize2, contentAlignment2);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15216x4f8ee6e9(BasicModal self, hrh output, ktz0 serialDesc) {
            ModalTemplate.write$Self(self, output, serialDesc);
            fr70[] fr70VarArr = $childSerializers;
            output.mo44943s(serialDesc, 0, (rr60) fr70VarArr[0].getValue(), self.backgroundColor);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.mo44943s(serialDesc, 1, messageText$$serializer, self.headline);
            output.mo44941k(serialDesc, 2, messageText$$serializer, self.body);
            output.mo44943s(serialDesc, 3, (rr60) fr70VarArr[3].getValue(), self.accessoryContent);
            output.mo44943s(serialDesc, 4, Button$$serializer.INSTANCE, self.primaryButton);
            if (output.mo48399d0() || self.accessoryContentSize != AccessoryContentSize.UNKNOWN) {
                output.mo44941k(serialDesc, 5, (rr60) fr70VarArr[5].getValue(), self.accessoryContentSize);
            }
            if (!output.mo48399d0() && self.contentAlignment == ContentAlignment.UNKNOWN) {
                return;
            }
            output.mo44941k(serialDesc, 6, (rr60) fr70VarArr[6].getValue(), self.contentAlignment);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageText getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessageText getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final AccessoryContentSize getAccessoryContentSize() {
            return this.accessoryContentSize;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final ContentAlignment getContentAlignment() {
            return this.contentAlignment;
        }

        public final BasicModal copy(BackgroundColor backgroundColor, MessageText headline, MessageText body, AccessoryContent accessoryContent, Button primaryButton, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment) {
            return new BasicModal(backgroundColor, headline, body, accessoryContent, primaryButton, accessoryContentSize, contentAlignment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BasicModal)) {
                return false;
            }
            BasicModal basicModal = (BasicModal) other;
            return wj50.m88271j(this.backgroundColor, basicModal.backgroundColor) && wj50.m88271j(this.headline, basicModal.headline) && wj50.m88271j(this.body, basicModal.body) && wj50.m88271j(this.accessoryContent, basicModal.accessoryContent) && wj50.m88271j(this.primaryButton, basicModal.primaryButton) && this.accessoryContentSize == basicModal.accessoryContentSize && this.contentAlignment == basicModal.contentAlignment;
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final AccessoryContentSize getAccessoryContentSize() {
            return this.accessoryContentSize;
        }

        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public final MessageText getBody() {
            return this.body;
        }

        public final ContentAlignment getContentAlignment() {
            return this.contentAlignment;
        }

        public final MessageText getHeadline() {
            return this.headline;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        public int hashCode() {
            BackgroundColor backgroundColor = this.backgroundColor;
            int iHashCode = (backgroundColor == null ? 0 : backgroundColor.hashCode()) * 31;
            MessageText messageText = this.headline;
            int iM39071h = ei6.m39071h(this.body, (iHashCode + (messageText == null ? 0 : messageText.hashCode())) * 31, 31);
            AccessoryContent accessoryContent = this.accessoryContent;
            int iHashCode2 = (iM39071h + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
            Button button = this.primaryButton;
            return this.contentAlignment.hashCode() + ((this.accessoryContentSize.hashCode() + ((iHashCode2 + (button != null ? button.hashCode() : 0)) * 31)) * 31);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.backgroundColor, flags);
            MessageText messageText = this.headline;
            if (messageText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                messageText.writeToParcel(dest, flags);
            }
            this.body.writeToParcel(dest, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            Button button = this.primaryButton;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, flags);
            }
            this.accessoryContentSize.writeToParcel(dest, flags);
            this.contentAlignment.writeToParcel(dest, flags);
        }

        public BasicModal(BackgroundColor backgroundColor, MessageText messageText, MessageText messageText2, AccessoryContent accessoryContent, Button button, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment) {
            super(null);
            this.backgroundColor = backgroundColor;
            this.headline = messageText;
            this.body = messageText2;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.accessoryContentSize = accessoryContentSize;
            this.contentAlignment = contentAlignment;
        }

        public /* synthetic */ BasicModal(BackgroundColor backgroundColor, MessageText messageText, MessageText messageText2, AccessoryContent accessoryContent, Button button, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(backgroundColor, messageText, messageText2, accessoryContent, button, (i & 32) != 0 ? AccessoryContentSize.UNKNOWN : accessoryContentSize, (i & 64) != 0 ? ContentAlignment.UNKNOWN : contentAlignment);
        }
    }

    public static final /* synthetic */ void write$Self(ModalTemplate self, hrh output, ktz0 serialDesc) {
    }
}
