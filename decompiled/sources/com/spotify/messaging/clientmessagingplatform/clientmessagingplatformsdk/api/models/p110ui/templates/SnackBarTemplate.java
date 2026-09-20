package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Header$$serializer;
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
import p204p.gut;
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
import p204p.vwp0;
import p204p.wj50;
import p204p.x8q0;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\u0005\u0019\u001a\u001b\u001c\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0001\u0004\u001d\u001e\u001f ¨\u0006!"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "<init>", "()V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;Lp/hrh;Lp/ktz0;)V", "", "text", "()Ljava/lang/String;", "buttonText", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "Companion", "Undefined", "BaseSnackBar", "JitSnackBar", "CustomSnackbar", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$BaseSnackBar;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$CustomSnackbar;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$JitSnackBar;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$Undefined;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class SnackBarTemplate implements MessageTemplate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final fr70 $cachedSerializer$delegate = q3d0.m72078I(2, Companion.C09531.INSTANCE);

    @Metadata(m24211d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010)JJ\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b>\u0010)¨\u0006A"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$BaseSnackBar;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "header", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "dismissButton", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$BaseSnackBar;Lp/hrh;Lp/ktz0;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component5", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$BaseSnackBar;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "getHeader", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getDismissButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class BaseSnackBar extends SnackBarTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final MessageText body;
        private final Button dismissButton;
        private final Header header;
        private final Button primaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BaseSnackBar> CREATOR = new Creator();
        private static final fr70[] $childSerializers = {null, null, q3d0.m72078I(2, SnackBarTemplate$BaseSnackBar$Companion$$childSerializers$1.INSTANCE), null, null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$BaseSnackBar$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$BaseSnackBar;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return SnackBarTemplate$BaseSnackBar$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<BaseSnackBar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseSnackBar createFromParcel(Parcel parcel) {
                return new BaseSnackBar(parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel), MessageText.CREATOR.createFromParcel(parcel), (AccessoryContent) parcel.readParcelable(BaseSnackBar.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseSnackBar[] newArray(int i) {
                return new BaseSnackBar[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BaseSnackBar(int i, Header header, MessageText messageText, AccessoryContent accessoryContent, Button button, Button button2, utz0 utz0Var) {
            super(i, utz0Var);
            if (31 != (i & 31)) {
                edo.m38617p(i, 31, SnackBarTemplate$BaseSnackBar$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.header = header;
            this.body = messageText;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.dismissButton = button2;
        }

        public static /* synthetic */ BaseSnackBar copy$default(BaseSnackBar baseSnackBar, Header header, MessageText messageText, AccessoryContent accessoryContent, Button button, Button button2, int i, Object obj) {
            if ((i & 1) != 0) {
                header = baseSnackBar.header;
            }
            if ((i & 2) != 0) {
                messageText = baseSnackBar.body;
            }
            if ((i & 4) != 0) {
                accessoryContent = baseSnackBar.accessoryContent;
            }
            if ((i & 8) != 0) {
                button = baseSnackBar.primaryButton;
            }
            if ((i & 16) != 0) {
                button2 = baseSnackBar.dismissButton;
            }
            Button button3 = button2;
            AccessoryContent accessoryContent2 = accessoryContent;
            return baseSnackBar.copy(header, messageText, accessoryContent2, button, button3);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15218x4f8ee6e9(BaseSnackBar self, hrh output, ktz0 serialDesc) {
            SnackBarTemplate.write$Self(self, output, serialDesc);
            fr70[] fr70VarArr = $childSerializers;
            output.mo44943s(serialDesc, 0, Header$$serializer.INSTANCE, self.header);
            output.mo44941k(serialDesc, 1, MessageText$$serializer.INSTANCE, self.body);
            output.mo44943s(serialDesc, 2, (rr60) fr70VarArr[2].getValue(), self.accessoryContent);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.mo44943s(serialDesc, 3, button$$serializer, self.primaryButton);
            output.mo44943s(serialDesc, 4, button$$serializer, self.dismissButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageText getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getDismissButton() {
            return this.dismissButton;
        }

        public final BaseSnackBar copy(Header header, MessageText body, AccessoryContent accessoryContent, Button primaryButton, Button dismissButton) {
            return new BaseSnackBar(header, body, accessoryContent, primaryButton, dismissButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseSnackBar)) {
                return false;
            }
            BaseSnackBar baseSnackBar = (BaseSnackBar) other;
            return wj50.m88271j(this.header, baseSnackBar.header) && wj50.m88271j(this.body, baseSnackBar.body) && wj50.m88271j(this.accessoryContent, baseSnackBar.accessoryContent) && wj50.m88271j(this.primaryButton, baseSnackBar.primaryButton) && wj50.m88271j(this.dismissButton, baseSnackBar.dismissButton);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final MessageText getBody() {
            return this.body;
        }

        public final Button getDismissButton() {
            return this.dismissButton;
        }

        public final Header getHeader() {
            return this.header;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        public int hashCode() {
            Header header = this.header;
            int iM39071h = ei6.m39071h(this.body, (header == null ? 0 : header.hashCode()) * 31, 31);
            AccessoryContent accessoryContent = this.accessoryContent;
            int iHashCode = (iM39071h + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
            Button button = this.primaryButton;
            int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.dismissButton;
            return iHashCode2 + (button2 != null ? button2.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Header header = this.header;
            if (header == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                header.writeToParcel(dest, flags);
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
            Button button2 = this.dismissButton;
            if (button2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button2.writeToParcel(dest, flags);
            }
        }

        public BaseSnackBar(Header header, MessageText messageText, AccessoryContent accessoryContent, Button button, Button button2) {
            super(null);
            this.header = header;
            this.body = messageText;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.dismissButton = button2;
        }
    }

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate$Companion$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09531 extends qe70 implements eh00 {
            public static final C09531 INSTANCE = new C09531();

            public C09531() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                jqv0 jqv0Var = qpv0.f191387a;
                return new qoy0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate", jqv0Var.mo54112b(SnackBarTemplate.class), new up60[]{jqv0Var.mo54112b(BaseSnackBar.class), jqv0Var.mo54112b(CustomSnackbar.class), jqv0Var.mo54112b(JitSnackBar.class), jqv0Var.mo54112b(Undefined.class)}, new rr60[]{SnackBarTemplate$BaseSnackBar$$serializer.INSTANCE, new SnackBarTemplate$CustomSnackbar$$serializer(new x8q0(jqv0Var.mo54112b(Object.class), new Annotation[0]), new x8q0(jqv0Var.mo54112b(Object.class), new Annotation[0]), new x8q0(jqv0Var.mo54112b(Object.class), new Annotation[0])), SnackBarTemplate$JitSnackBar$$serializer.INSTANCE, new hmk0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate.Undefined", Undefined.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ rr60 get$cachedSerializer() {
            return (rr60) SnackBarTemplate.$cachedSerializer$delegate.getValue();
        }

        public final rr60 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m24211d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 3*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u000243B%\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0087\u0001\u0010\u001b\u001a\u00020\u0018\"\n\b\u0003\u0010\u0001*\u0004\u0018\u00010\u000e\"\n\b\u0004\u0010\u0002*\u0004\u0018\u00010\u000e\"\n\b\u0005\u0010\u0003*\u0004\u0018\u00010\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00040\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00050\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J$\u0010#\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J@\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b-\u0010.R4\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010$¨\u00065"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$CustomSnackbar;", "P", "S", "E", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "Lp/gut;", "elementAndProps", "<init>", "(Lp/gut;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILp/utz0;)V", "", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/rr60;", "typeSerial0", "typeSerial1", "typeSerial2", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$CustomSnackbar;Lp/hrh;Lp/ktz0;Lp/rr60;Lp/rr60;Lp/rr60;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lp/gut;", "copy", "(Lp/gut;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$CustomSnackbar;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/gut;", "getElementAndProps", "getElementAndProps$annotations", "()V", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class CustomSnackbar<P, S, E> extends SnackBarTemplate {
        public static final int $stable = 0;
        private final gut elementAndProps;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<CustomSnackbar<?, ?, ?>> CREATOR = new Creator();
        private static final ktz0 $cachedDescriptor = new vwp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate.CustomSnackbar", null, 0);

        @Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b0\u0007\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00040\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00050\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$CustomSnackbar$Companion;", "", "<init>", "()V", "P", "S", "E", "Lp/rr60;", "typeSerial0", "typeSerial1", "typeSerial2", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$CustomSnackbar;", "serializer", "(Lp/rr60;Lp/rr60;Lp/rr60;)Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <P, S, E> rr60 serializer(rr60 typeSerial0, rr60 typeSerial1, rr60 typeSerial2) {
                return new SnackBarTemplate$CustomSnackbar$$serializer(typeSerial0, typeSerial1, typeSerial2);
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomSnackbar<?, ?, ?>> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final CustomSnackbar<?, ?, ?> createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new CustomSnackbar<>(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomSnackbar<?, ?, ?>[] newArray(int i) {
                return new CustomSnackbar[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CustomSnackbar() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CustomSnackbar copy$default(CustomSnackbar customSnackbar, gut gutVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gutVar = customSnackbar.elementAndProps;
            }
            return customSnackbar.copy(gutVar);
        }

        public static /* synthetic */ void getElementAndProps$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final gut getElementAndProps() {
            return this.elementAndProps;
        }

        public final CustomSnackbar<P, S, E> copy(gut elementAndProps) {
            return new CustomSnackbar<>(elementAndProps);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomSnackbar) && wj50.m88271j(this.elementAndProps, ((CustomSnackbar) other).elementAndProps);
        }

        public final gut getElementAndProps() {
            return this.elementAndProps;
        }

        public int hashCode() {
            gut gutVar = this.elementAndProps;
            if (gutVar == null) {
                return 0;
            }
            return gutVar.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        public /* synthetic */ CustomSnackbar(int i, utz0 utz0Var) {
            super(i, utz0Var);
            this.elementAndProps = null;
        }

        public CustomSnackbar(gut gutVar) {
            super(null);
            this.elementAndProps = gutVar;
        }

        public /* synthetic */ CustomSnackbar(gut gutVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gutVar);
        }
    }

    @Metadata(m24211d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\"¨\u00061"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$JitSnackBar;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "", "htmlString", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$JitSnackBar;Lp/hrh;Lp/ktz0;)V", "write$Self", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$JitSnackBar;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHtmlString", "Ljava/util/List;", "getButtons", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class JitSnackBar extends SnackBarTemplate {
        public static final int $stable = 0;
        private final List<Button> buttons;
        private final String htmlString;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<JitSnackBar> CREATOR = new Creator();
        private static final fr70[] $childSerializers = {null, q3d0.m72078I(2, SnackBarTemplate$JitSnackBar$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$JitSnackBar$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$JitSnackBar;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return SnackBarTemplate$JitSnackBar$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<JitSnackBar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JitSnackBar createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(Button.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new JitSnackBar(string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JitSnackBar[] newArray(int i) {
                return new JitSnackBar[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public JitSnackBar() {
            this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JitSnackBar copy$default(JitSnackBar jitSnackBar, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jitSnackBar.htmlString;
            }
            if ((i & 2) != 0) {
                list = jitSnackBar.buttons;
            }
            return jitSnackBar.copy(str, list);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15220x4f8ee6e9(JitSnackBar self, hrh output, ktz0 serialDesc) {
            SnackBarTemplate.write$Self(self, output, serialDesc);
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

        public final JitSnackBar copy(String htmlString, List<Button> buttons) {
            return new JitSnackBar(htmlString, buttons);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JitSnackBar)) {
                return false;
            }
            JitSnackBar jitSnackBar = (JitSnackBar) other;
            return wj50.m88271j(this.htmlString, jitSnackBar.htmlString) && wj50.m88271j(this.buttons, jitSnackBar.buttons);
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
            return "JitSnackBar(htmlString=htmlString, buttons=" + this.buttons + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.htmlString);
            Iterator itM42468l = fr0.m42468l(dest, this.buttons);
            while (itM42468l.hasNext()) {
                ((Button) itM42468l.next()).writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ JitSnackBar(int i, String str, List list, utz0 utz0Var) {
            super(i, utz0Var);
            this.htmlString = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.buttons = lau.f131415a;
            } else {
                this.buttons = list;
            }
        }

        public JitSnackBar(String str, List<Button> list) {
            super(null);
            this.htmlString = str;
            this.buttons = list;
        }

        public /* synthetic */ JitSnackBar(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? lau.f131415a : list);
        }
    }

    @rtz0
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate$Undefined;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lp/rr60;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Undefined extends SnackBarTemplate {
        public static final int $stable = 0;
        public static final Undefined INSTANCE = new Undefined();
        public static final Parcelable.Creator<Undefined> CREATOR = new Creator();
        private static final /* synthetic */ fr70 $cachedSerializer$delegate = q3d0.m72078I(2, C09541.INSTANCE);

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate$Undefined$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09541 extends qe70 implements eh00 {
            public static final C09541 INSTANCE = new C09541();

            public C09541() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                return new hmk0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate.Undefined", Undefined.INSTANCE, new Annotation[0]);
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

        public final rr60 serializer() {
            return get$cachedSerializer();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }
    }

    public /* synthetic */ SnackBarTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String buttonText() {
        Button buttonPrimaryButton;
        ButtonStyle style;
        ButtonStyle style2;
        if (this instanceof BaseSnackBar) {
            Button buttonPrimaryButton2 = primaryButton();
            if (buttonPrimaryButton2 == null || (style2 = buttonPrimaryButton2.getStyle()) == null) {
                return null;
            }
            return style2.getText();
        }
        if (!(this instanceof JitSnackBar) || (buttonPrimaryButton = primaryButton()) == null || (style = buttonPrimaryButton.getStyle()) == null) {
            return null;
        }
        return style.getText();
    }

    public final Button primaryButton() {
        if (this instanceof BaseSnackBar) {
            return ((BaseSnackBar) this).getPrimaryButton();
        }
        Object obj = null;
        if (!(this instanceof JitSnackBar)) {
            return null;
        }
        for (Object obj2 : ((JitSnackBar) this).getButtons()) {
            if (!wj50.m88271j(((Button) obj2).getIdentifier(), "dismissCta")) {
                obj = obj2;
                break;
            }
        }
        return (Button) obj;
    }

    public final String text() {
        if (this instanceof BaseSnackBar) {
            return ((BaseSnackBar) this).getBody().getText();
        }
        return this instanceof JitSnackBar ? ((JitSnackBar) this).getHtmlString() : "";
    }

    private SnackBarTemplate() {
    }

    public /* synthetic */ SnackBarTemplate(int i, utz0 utz0Var) {
    }

    public static final /* synthetic */ void write$Self(SnackBarTemplate self, hrh output, ktz0 serialDesc) {
    }
}
