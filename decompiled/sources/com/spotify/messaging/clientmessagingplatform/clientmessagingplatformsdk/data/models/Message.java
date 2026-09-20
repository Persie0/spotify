package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Format;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.c7h0;
import p204p.dq60;
import p204p.edo;
import p204p.eh00;
import p204p.fr0;
import p204p.fr70;
import p204p.hrh;
import p204p.jqv0;
import p204p.klh;
import p204p.ktz0;
import p204p.nap;
import p204p.q3d0;
import p204p.qe70;
import p204p.qoy0;
import p204p.qpv0;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.up60;
import p204p.utz0;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
@Keep
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0003\u0017\u0018\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "", "<init>", "()V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;Lp/hrh;Lp/ktz0;)V", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger;", "getTriggers", "()Ljava/util/List;", "triggers", "Companion", "JITMessageStub", "CreativeMessage", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$JITMessageStub;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class Message {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final fr70 $cachedSerializer$delegate = q3d0.m72078I(2, Companion.C09651.INSTANCE);

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message$Companion$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09651 extends qe70 implements eh00 {
            public static final C09651 INSTANCE = new C09651();

            public C09651() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                jqv0 jqv0Var = qpv0.f191387a;
                return new qoy0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message", jqv0Var.mo54112b(Message.class), new up60[]{jqv0Var.mo54112b(CreativeMessage.class), jqv0Var.mo54112b(JITMessageStub.class)}, new rr60[]{Message$CreativeMessage$$serializer.INSTANCE, Message$JITMessageStub$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ rr60 get$cachedSerializer() {
            return (rr60) Message.$cachedSerializer$delegate.getValue();
        }

        public final rr60 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(m24211d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0002\\[B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u007f\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020#2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0019¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b>\u0010?Jv\u0010@\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bB\u00101J\u0010\u0010C\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bC\u0010(J\u001a\u0010G\u001a\u00020F2\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bG\u0010HR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bN\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u00109R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u0010;R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bX\u0010=R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u0010?¨\u0006]"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "Landroid/os/Parcelable;", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger;", "triggers", "", "id", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "format", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;", "source", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;", "loggingData", "", "endTimestamp", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;", "messageType", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/CappingRule;", "cappingRules", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "pacing", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;JLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;Ljava/util/Set;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;JLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;Ljava/util/Set;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;Lp/hrh;Lp/ktz0;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;", "component6", "()J", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;", "component8", "()Ljava/util/Set;", "component9", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;JLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;Ljava/util/Set;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTriggers", "Ljava/lang/String;", "getId", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "getFormat", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;", "getSource", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;", "getLoggingData", "J", "getEndTimestamp", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;", "getMessageType", "Ljava/util/Set;", "getCappingRules", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "getPacing", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class CreativeMessage extends Message implements Parcelable {
        public static final int $stable = 0;
        private final Set<CappingRule> cappingRules;
        private final long endTimestamp;
        private final Format format;
        private final String id;
        private final LoggingData loggingData;
        private final MessageType messageType;
        private final Pacing pacing;
        private final MessageSource source;
        private final List<Trigger> triggers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<CreativeMessage> CREATOR = new Creator();
        private static final fr70[] $childSerializers = {q3d0.m72078I(2, Message$CreativeMessage$Companion$$childSerializers$1.INSTANCE), null, q3d0.m72078I(2, Message$CreativeMessage$Companion$$childSerializers$2.INSTANCE), q3d0.m72078I(2, Message$CreativeMessage$Companion$$childSerializers$3.INSTANCE), null, null, q3d0.m72078I(2, Message$CreativeMessage$Companion$$childSerializers$4.INSTANCE), q3d0.m72078I(2, Message$CreativeMessage$Companion$$childSerializers$5.INSTANCE), null};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return Message$CreativeMessage$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<CreativeMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreativeMessage createFromParcel(Parcel parcel) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(Trigger.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                String string = parcel.readString();
                Format format = (Format) parcel.readParcelable(CreativeMessage.class.getClassLoader());
                MessageSource messageSourceCreateFromParcel = MessageSource.CREATOR.createFromParcel(parcel);
                LoggingData loggingDataCreateFromParcel = LoggingData.CREATOR.createFromParcel(parcel);
                long j = parcel.readLong();
                MessageType messageTypeCreateFromParcel = MessageType.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashSet.add(parcel.readParcelable(CreativeMessage.class.getClassLoader()));
                }
                return new CreativeMessage(arrayList, string, format, messageSourceCreateFromParcel, loggingDataCreateFromParcel, j, messageTypeCreateFromParcel, linkedHashSet, Pacing.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreativeMessage[] newArray(int i) {
                return new CreativeMessage[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CreativeMessage(int i, List list, String str, Format format, MessageSource messageSource, LoggingData loggingData, long j, MessageType messageType, Set set, Pacing pacing, utz0 utz0Var) {
            super(i, utz0Var);
            if (511 != (i & 511)) {
                edo.m38617p(i, 511, Message$CreativeMessage$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.triggers = list;
            this.id = str;
            this.format = format;
            this.source = messageSource;
            this.loggingData = loggingData;
            this.endTimestamp = j;
            this.messageType = messageType;
            this.cappingRules = set;
            this.pacing = pacing;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CreativeMessage copy$default(CreativeMessage creativeMessage, List list, String str, Format format, MessageSource messageSource, LoggingData loggingData, long j, MessageType messageType, Set set, Pacing pacing, int i, Object obj) {
            if ((i & 1) != 0) {
                list = creativeMessage.triggers;
            }
            if ((i & 2) != 0) {
                str = creativeMessage.id;
            }
            if ((i & 4) != 0) {
                format = creativeMessage.format;
            }
            if ((i & 8) != 0) {
                messageSource = creativeMessage.source;
            }
            if ((i & 16) != 0) {
                loggingData = creativeMessage.loggingData;
            }
            if ((i & 32) != 0) {
                j = creativeMessage.endTimestamp;
            }
            if ((i & 64) != 0) {
                messageType = creativeMessage.messageType;
            }
            if ((i & 128) != 0) {
                set = creativeMessage.cappingRules;
            }
            if ((i & 256) != 0) {
                pacing = creativeMessage.pacing;
            }
            Pacing pacing2 = pacing;
            MessageType messageType2 = messageType;
            long j2 = j;
            MessageSource messageSource2 = messageSource;
            LoggingData loggingData2 = loggingData;
            Format format2 = format;
            return creativeMessage.copy(list, str, format2, messageSource2, loggingData2, j2, messageType2, set, pacing2);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15232x4f8ee6e9(CreativeMessage self, hrh output, ktz0 serialDesc) {
            Message.write$Self(self, output, serialDesc);
            fr70[] fr70VarArr = $childSerializers;
            output.mo44941k(serialDesc, 0, (rr60) fr70VarArr[0].getValue(), self.getTriggers());
            output.mo44931G(serialDesc, 1, self.id);
            output.mo44941k(serialDesc, 2, (rr60) fr70VarArr[2].getValue(), self.format);
            output.mo44941k(serialDesc, 3, (rr60) fr70VarArr[3].getValue(), self.source);
            output.mo44941k(serialDesc, 4, LoggingData$$serializer.INSTANCE, self.loggingData);
            output.mo44942l(serialDesc, 5, self.endTimestamp);
            output.mo44941k(serialDesc, 6, (rr60) fr70VarArr[6].getValue(), self.messageType);
            output.mo44941k(serialDesc, 7, (rr60) fr70VarArr[7].getValue(), self.cappingRules);
            output.mo44941k(serialDesc, 8, Pacing$$serializer.INSTANCE, self.pacing);
        }

        public final List<Trigger> component1() {
            return this.triggers;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Format getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final LoggingData getLoggingData() {
            return this.loggingData;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getEndTimestamp() {
            return this.endTimestamp;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MessageType getMessageType() {
            return this.messageType;
        }

        public final Set<CappingRule> component8() {
            return this.cappingRules;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Pacing getPacing() {
            return this.pacing;
        }

        public final CreativeMessage copy(List<Trigger> triggers, String id, Format format, MessageSource source, LoggingData loggingData, long endTimestamp, MessageType messageType, Set<? extends CappingRule> cappingRules, Pacing pacing) {
            return new CreativeMessage(triggers, id, format, source, loggingData, endTimestamp, messageType, cappingRules, pacing);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreativeMessage)) {
                return false;
            }
            CreativeMessage creativeMessage = (CreativeMessage) other;
            return wj50.m88271j(this.triggers, creativeMessage.triggers) && wj50.m88271j(this.id, creativeMessage.id) && wj50.m88271j(this.format, creativeMessage.format) && this.source == creativeMessage.source && wj50.m88271j(this.loggingData, creativeMessage.loggingData) && this.endTimestamp == creativeMessage.endTimestamp && this.messageType == creativeMessage.messageType && wj50.m88271j(this.cappingRules, creativeMessage.cappingRules) && wj50.m88271j(this.pacing, creativeMessage.pacing);
        }

        public final Set<CappingRule> getCappingRules() {
            return this.cappingRules;
        }

        public final long getEndTimestamp() {
            return this.endTimestamp;
        }

        public final Format getFormat() {
            return this.format;
        }

        public final String getId() {
            return this.id;
        }

        public final LoggingData getLoggingData() {
            return this.loggingData;
        }

        public final MessageType getMessageType() {
            return this.messageType;
        }

        public final Pacing getPacing() {
            return this.pacing;
        }

        public final MessageSource getSource() {
            return this.source;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message
        public List<Trigger> getTriggers() {
            return this.triggers;
        }

        public int hashCode() {
            return this.pacing.hashCode() + klh.m56830b((this.messageType.hashCode() + dq60.m36605e((this.loggingData.hashCode() + ((this.source.hashCode() + ((this.format.hashCode() + s571.m77243b(this.triggers.hashCode() * 31, 31, this.id)) * 31)) * 31)) * 31, this.endTimestamp, 31)) * 31, 31, this.cappingRules);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator itM42468l = fr0.m42468l(dest, this.triggers);
            while (itM42468l.hasNext()) {
                ((Trigger) itM42468l.next()).writeToParcel(dest, flags);
            }
            dest.writeString(this.id);
            dest.writeParcelable(this.format, flags);
            this.source.writeToParcel(dest, flags);
            this.loggingData.writeToParcel(dest, flags);
            dest.writeLong(this.endTimestamp);
            this.messageType.writeToParcel(dest, flags);
            Iterator itM64022o = nap.m64022o(this.cappingRules, dest);
            while (itM64022o.hasNext()) {
                dest.writeParcelable((Parcelable) itM64022o.next(), flags);
            }
            this.pacing.writeToParcel(dest, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CreativeMessage(List<Trigger> list, String str, Format format, MessageSource messageSource, LoggingData loggingData, long j, MessageType messageType, Set<? extends CappingRule> set, Pacing pacing) {
            super(null);
            this.triggers = list;
            this.id = str;
            this.format = format;
            this.source = messageSource;
            this.loggingData = loggingData;
            this.endTimestamp = j;
            this.messageType = messageType;
            this.cappingRules = set;
            this.pacing = pacing;
        }
    }

    @Metadata(m24211d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006'"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$JITMessageStub;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger;", "triggers", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/util/List;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$JITMessageStub;Lp/hrh;Lp/ktz0;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$JITMessageStub;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTriggers", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class JITMessageStub extends Message {
        public static final int $stable = 0;
        private final List<Trigger> triggers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {q3d0.m72078I(2, Message$JITMessageStub$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$JITMessageStub$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$JITMessageStub;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return Message$JITMessageStub$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ JITMessageStub(int i, List list, utz0 utz0Var) {
            super(i, utz0Var);
            if (1 != (i & 1)) {
                edo.m38617p(i, 1, Message$JITMessageStub$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.triggers = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JITMessageStub copy$default(JITMessageStub jITMessageStub, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = jITMessageStub.triggers;
            }
            return jITMessageStub.copy(list);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15233x4f8ee6e9(JITMessageStub self, hrh output, ktz0 serialDesc) {
            Message.write$Self(self, output, serialDesc);
            output.mo44941k(serialDesc, 0, (rr60) $childSerializers[0].getValue(), self.getTriggers());
        }

        public final List<Trigger> component1() {
            return this.triggers;
        }

        public final JITMessageStub copy(List<Trigger> triggers) {
            return new JITMessageStub(triggers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JITMessageStub) && wj50.m88271j(this.triggers, ((JITMessageStub) other).triggers);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message
        public List<Trigger> getTriggers() {
            return this.triggers;
        }

        public int hashCode() {
            return this.triggers.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public JITMessageStub(List<Trigger> list) {
            super(null);
            this.triggers = list;
        }
    }

    public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<Trigger> getTriggers();

    private Message() {
    }

    public /* synthetic */ Message(int i, utz0 utz0Var) {
    }

    public static final /* synthetic */ void write$Self(Message self, hrh output, ktz0 serialDesc) {
    }
}
