package com.spotify.eventsender.corebridge;

import com.spotify.eventsender.api.EventPersistedCallback;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edb;
import p204p.fl40;
import p204p.i6t0;
import p204p.j7x;
import p204p.n6x;
import p204p.rcx;
import p204p.v6x;
import p204p.vuc;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/eventsender/corebridge/EventSenderCoreBridgeImpl;", "Lcom/spotify/eventsender/api/EventSenderCoreBridge;", "Lp/v6x;", "eventSender", "<init>", "(Lp/v6x;)V", "", "eventName", "payload", "overrideUserName", "Lcom/spotify/eventsender/api/EventPersistedCallback;", "callback", "", "send", "([B[B[BLcom/spotify/eventsender/api/EventPersistedCallback;)I", "Lp/w2a1;", "queueMetricsDataSnapshotForSending", "([B[B)V", "Lp/v6x;", "Lp/n6x;", "eventPublisher", "Lp/n6x;", "Companion", "src_main_java_com_spotify_eventsender_corebridge-corebridge"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EventSenderCoreBridgeImpl implements EventSenderCoreBridge {
    private static final Companion Companion = new Companion(null);
    private final n6x eventPublisher;
    private final v6x eventSender;

    @Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\t"}, m24212d2 = {"Lcom/spotify/eventsender/corebridge/EventSenderCoreBridgeImpl$Companion;", "", "<init>", "()V", "decodeNullableUTF8", "", "buffer", "", "decodeUTF8", "src_main_java_com_spotify_eventsender_corebridge-corebridge"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String decodeNullableUTF8(byte[] buffer) {
            if (buffer != null) {
                return decodeUTF8(buffer);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String decodeUTF8(byte[] buffer) {
            return new String(buffer, vuc.f244913a);
        }

        private Companion() {
        }
    }

    public EventSenderCoreBridgeImpl(v6x v6xVar) {
        this.eventSender = v6xVar;
        this.eventPublisher = ((j7x) v6xVar).f109692H;
    }

    @Override // com.spotify.eventsender.api.EventSenderCoreBridge
    public void queueMetricsDataSnapshotForSending(byte[] eventName, byte[] payload) {
        String strDecodeUTF8 = Companion.decodeUTF8(eventName);
        fl40 fl40Var = (fl40) ((j7x) this.eventSender).f109688D.getValue();
        rcx rcxVar = new rcx(fl40Var, strDecodeUTF8, fl40Var.f70688c.mo24510D0(strDecodeUTF8, payload, fl40Var.f70689d.getBytes(vuc.f244913a)), 18);
        synchronized (fl40Var.f70687b) {
            rcxVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl$send$result$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.spotify.eventsender.api.EventSenderCoreBridge
    public int send(byte[] eventName, byte[] payload, byte[] overrideUserName, final EventPersistedCallback callback) {
        Companion companion = Companion;
        return edb.m38547C(this.eventPublisher.mo27068a(companion.decodeUTF8(eventName), payload, companion.decodeNullableUTF8(overrideUserName), new i6t0() { // from class: com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl$send$result$1
            @Override // p204p.i6t0
            public void onEventStored(int result) {
                EventPersistedCallback eventPersistedCallback = callback;
                if (eventPersistedCallback != null) {
                    eventPersistedCallback.invoke(result);
                }
                EventPersistedCallback eventPersistedCallback2 = callback;
                if (eventPersistedCallback2 != null) {
                    eventPersistedCallback2.destroy();
                }
            }
        }));
    }
}
