package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Header$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText$$serializer;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edo;
import p204p.eh00;
import p204p.ei6;
import p204p.fr70;
import p204p.gut;
import p204p.hmk0;
import p204p.hrh;
import p204p.jqv0;
import p204p.ktz0;
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
@Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "<init>", "()V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;Lp/hrh;Lp/ktz0;)V", "Companion", "Undefined", "BaseTooltip", "CustomTooltip", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$BaseTooltip;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$Undefined;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class TooltipTemplate implements MessageTemplate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final fr70 $cachedSerializer$delegate = q3d0.m72078I(2, Companion.C09581.INSTANCE);

    @Metadata(m24211d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,JH\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b2\u0010\u001dJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010,¨\u0006D"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$BaseTooltip;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAlignment;", "alignment", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "text", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "header", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "button", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAlignment;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAlignment;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$BaseTooltip;Lp/hrh;Lp/ktz0;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAlignment;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAlignment;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$BaseTooltip;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAlignment;", "getAlignment", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getText", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "getHeader", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class BaseTooltip extends TooltipTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final TooltipAlignment alignment;
        private final Button button;
        private final Header header;
        private final MessageText text;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BaseTooltip> CREATOR = new Creator();
        private static final fr70[] $childSerializers = {q3d0.m72078I(2, TooltipTemplate$BaseTooltip$Companion$$childSerializers$1.INSTANCE), null, q3d0.m72078I(2, TooltipTemplate$BaseTooltip$Companion$$childSerializers$2.INSTANCE), null, null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$BaseTooltip$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$BaseTooltip;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return TooltipTemplate$BaseTooltip$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<BaseTooltip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseTooltip createFromParcel(Parcel parcel) {
                return new BaseTooltip(TooltipAlignment.CREATOR.createFromParcel(parcel), MessageText.CREATOR.createFromParcel(parcel), (AccessoryContent) parcel.readParcelable(BaseTooltip.class.getClassLoader()), parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseTooltip[] newArray(int i) {
                return new BaseTooltip[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BaseTooltip(int i, TooltipAlignment tooltipAlignment, MessageText messageText, AccessoryContent accessoryContent, Header header, Button button, utz0 utz0Var) {
            super(i, utz0Var);
            if (3 != (i & 3)) {
                edo.m38617p(i, 3, TooltipTemplate$BaseTooltip$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.alignment = tooltipAlignment;
            this.text = messageText;
            if ((i & 4) == 0) {
                this.accessoryContent = null;
            } else {
                this.accessoryContent = accessoryContent;
            }
            if ((i & 8) == 0) {
                this.header = null;
            } else {
                this.header = header;
            }
            if ((i & 16) == 0) {
                this.button = null;
            } else {
                this.button = button;
            }
        }

        public static /* synthetic */ BaseTooltip copy$default(BaseTooltip baseTooltip, TooltipAlignment tooltipAlignment, MessageText messageText, AccessoryContent accessoryContent, Header header, Button button, int i, Object obj) {
            if ((i & 1) != 0) {
                tooltipAlignment = baseTooltip.alignment;
            }
            if ((i & 2) != 0) {
                messageText = baseTooltip.text;
            }
            if ((i & 4) != 0) {
                accessoryContent = baseTooltip.accessoryContent;
            }
            if ((i & 8) != 0) {
                header = baseTooltip.header;
            }
            if ((i & 16) != 0) {
                button = baseTooltip.button;
            }
            Button button2 = button;
            AccessoryContent accessoryContent2 = accessoryContent;
            return baseTooltip.copy(tooltipAlignment, messageText, accessoryContent2, header, button2);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15222x4f8ee6e9(BaseTooltip self, hrh output, ktz0 serialDesc) {
            TooltipTemplate.write$Self(self, output, serialDesc);
            fr70[] fr70VarArr = $childSerializers;
            output.mo44941k(serialDesc, 0, (rr60) fr70VarArr[0].getValue(), self.alignment);
            output.mo44941k(serialDesc, 1, MessageText$$serializer.INSTANCE, self.text);
            if (output.mo48399d0() || self.accessoryContent != null) {
                output.mo44943s(serialDesc, 2, (rr60) fr70VarArr[2].getValue(), self.accessoryContent);
            }
            if (output.mo48399d0() || self.header != null) {
                output.mo44943s(serialDesc, 3, Header$$serializer.INSTANCE, self.header);
            }
            if (!output.mo48399d0() && self.button == null) {
                return;
            }
            output.mo44943s(serialDesc, 4, Button$$serializer.INSTANCE, self.button);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TooltipAlignment getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageText getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        public final BaseTooltip copy(TooltipAlignment alignment, MessageText text, AccessoryContent accessoryContent, Header header, Button button) {
            return new BaseTooltip(alignment, text, accessoryContent, header, button);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseTooltip)) {
                return false;
            }
            BaseTooltip baseTooltip = (BaseTooltip) other;
            return this.alignment == baseTooltip.alignment && wj50.m88271j(this.text, baseTooltip.text) && wj50.m88271j(this.accessoryContent, baseTooltip.accessoryContent) && wj50.m88271j(this.header, baseTooltip.header) && wj50.m88271j(this.button, baseTooltip.button);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final TooltipAlignment getAlignment() {
            return this.alignment;
        }

        public final Button getButton() {
            return this.button;
        }

        public final Header getHeader() {
            return this.header;
        }

        public final MessageText getText() {
            return this.text;
        }

        public int hashCode() {
            int iM39071h = ei6.m39071h(this.text, this.alignment.hashCode() * 31, 31);
            AccessoryContent accessoryContent = this.accessoryContent;
            int iHashCode = (iM39071h + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
            Header header = this.header;
            int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
            Button button = this.button;
            return iHashCode2 + (button != null ? button.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.alignment.writeToParcel(dest, flags);
            this.text.writeToParcel(dest, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            Header header = this.header;
            if (header == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                header.writeToParcel(dest, flags);
            }
            Button button = this.button;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, flags);
            }
        }

        public BaseTooltip(TooltipAlignment tooltipAlignment, MessageText messageText, AccessoryContent accessoryContent, Header header, Button button) {
            super(null);
            this.alignment = tooltipAlignment;
            this.text = messageText;
            this.accessoryContent = accessoryContent;
            this.header = header;
            this.button = button;
        }

        public /* synthetic */ BaseTooltip(TooltipAlignment tooltipAlignment, MessageText messageText, AccessoryContent accessoryContent, Header header, Button button, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(tooltipAlignment, messageText, (i & 4) != 0 ? null : accessoryContent, (i & 8) != 0 ? null : header, (i & 16) != 0 ? null : button);
        }
    }

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate$Companion$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09581 extends qe70 implements eh00 {
            public static final C09581 INSTANCE = new C09581();

            public C09581() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                jqv0 jqv0Var = qpv0.f191387a;
                return new qoy0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate", jqv0Var.mo54112b(TooltipTemplate.class), new up60[]{jqv0Var.mo54112b(BaseTooltip.class), jqv0Var.mo54112b(CustomTooltip.class), jqv0Var.mo54112b(Undefined.class)}, new rr60[]{TooltipTemplate$BaseTooltip$$serializer.INSTANCE, new TooltipTemplate$CustomTooltip$$serializer(new x8q0(jqv0Var.mo54112b(Object.class), new Annotation[0]), new x8q0(jqv0Var.mo54112b(Object.class), new Annotation[0]), new x8q0(jqv0Var.mo54112b(Object.class), new Annotation[0])), new hmk0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate.Undefined", Undefined.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ rr60 get$cachedSerializer() {
            return (rr60) TooltipTemplate.$cachedSerializer$delegate.getValue();
        }

        public final rr60 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m24211d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 3*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u000243B%\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0087\u0001\u0010\u001b\u001a\u00020\u0018\"\n\b\u0003\u0010\u0001*\u0004\u0018\u00010\u000e\"\n\b\u0004\u0010\u0002*\u0004\u0018\u00010\u000e\"\n\b\u0005\u0010\u0003*\u0004\u0018\u00010\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00040\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00050\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J$\u0010#\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J@\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b-\u0010.R4\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010$¨\u00065"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;", "P", "S", "E", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "Lp/gut;", "elementAndProps", "<init>", "(Lp/gut;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILp/utz0;)V", "", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/rr60;", "typeSerial0", "typeSerial1", "typeSerial2", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;Lp/hrh;Lp/ktz0;Lp/rr60;Lp/rr60;Lp/rr60;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lp/gut;", "copy", "(Lp/gut;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/gut;", "getElementAndProps", "getElementAndProps$annotations", "()V", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class CustomTooltip<P, S, E> extends TooltipTemplate {
        public static final int $stable = 0;
        private final gut elementAndProps;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<CustomTooltip<?, ?, ?>> CREATOR = new Creator();
        private static final ktz0 $cachedDescriptor = new vwp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate.CustomTooltip", null, 0);

        @Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b0\u0007\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00040\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00050\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip$Companion;", "", "<init>", "()V", "P", "S", "E", "Lp/rr60;", "typeSerial0", "typeSerial1", "typeSerial2", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;", "serializer", "(Lp/rr60;Lp/rr60;Lp/rr60;)Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <P, S, E> rr60 serializer(rr60 typeSerial0, rr60 typeSerial1, rr60 typeSerial2) {
                return new TooltipTemplate$CustomTooltip$$serializer(typeSerial0, typeSerial1, typeSerial2);
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomTooltip<?, ?, ?>> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final CustomTooltip<?, ?, ?> createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new CustomTooltip<>(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomTooltip<?, ?, ?>[] newArray(int i) {
                return new CustomTooltip[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CustomTooltip() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CustomTooltip copy$default(CustomTooltip customTooltip, gut gutVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gutVar = customTooltip.elementAndProps;
            }
            return customTooltip.copy(gutVar);
        }

        public static /* synthetic */ void getElementAndProps$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final gut getElementAndProps() {
            return this.elementAndProps;
        }

        public final CustomTooltip<P, S, E> copy(gut elementAndProps) {
            return new CustomTooltip<>(elementAndProps);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomTooltip) && wj50.m88271j(this.elementAndProps, ((CustomTooltip) other).elementAndProps);
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

        public /* synthetic */ CustomTooltip(int i, utz0 utz0Var) {
            super(i, utz0Var);
            this.elementAndProps = null;
        }

        public CustomTooltip(gut gutVar) {
            super(null);
            this.elementAndProps = gutVar;
        }

        public /* synthetic */ CustomTooltip(gut gutVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gutVar);
        }
    }

    @rtz0
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$Undefined;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lp/rr60;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Undefined extends TooltipTemplate {
        public static final int $stable = 0;
        public static final Undefined INSTANCE = new Undefined();
        public static final Parcelable.Creator<Undefined> CREATOR = new Creator();
        private static final /* synthetic */ fr70 $cachedSerializer$delegate = q3d0.m72078I(2, C09591.INSTANCE);

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate$Undefined$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09591 extends qe70 implements eh00 {
            public static final C09591 INSTANCE = new C09591();

            public C09591() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                return new hmk0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate.Undefined", Undefined.INSTANCE, new Annotation[0]);
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

    public /* synthetic */ TooltipTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TooltipTemplate() {
    }

    public /* synthetic */ TooltipTemplate(int i, utz0 utz0Var) {
    }

    public static final /* synthetic */ void write$Self(TooltipTemplate self, hrh output, ktz0 serialDesc) {
    }
}
