package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.sc5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\n\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\n\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles", "Lp/sc5;", "Lcom/spotify/interapp/model/AppProtocol$Empty;", "dealer", "broker", "subscriber", "caller", "<init>", "(Lcom/spotify/interapp/model/AppProtocol$Empty;Lcom/spotify/interapp/model/AppProtocol$Empty;Lcom/spotify/interapp/model/AppProtocol$Empty;Lcom/spotify/interapp/model/AppProtocol$Empty;)V", "c", "Lcom/spotify/interapp/model/AppProtocol$Empty;", "getDealer", "()Lcom/spotify/interapp/model/AppProtocol$Empty;", "setDealer", "(Lcom/spotify/interapp/model/AppProtocol$Empty;)V", "getDealer$annotations", "()V", "d", "getBroker", "setBroker", "getBroker$annotations", "e", "getSubscriber", "setSubscriber", "getSubscriber$annotations", "f", "getCaller", "setCaller", "getCaller$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$HelloDetailsAppProtocol$Roles extends sc5 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final AppProtocol$Empty dealer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final AppProtocol$Empty broker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final AppProtocol$Empty subscriber;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final AppProtocol$Empty caller;

    public AppProtocol$HelloDetailsAppProtocol$Roles(@gk60(name = "dealer") AppProtocol$Empty appProtocol$Empty, @gk60(name = "broker") AppProtocol$Empty appProtocol$Empty2, @gk60(name = "subscriber") AppProtocol$Empty appProtocol$Empty3, @gk60(name = "caller") AppProtocol$Empty appProtocol$Empty4) {
        this.dealer = appProtocol$Empty;
        this.broker = appProtocol$Empty2;
        this.subscriber = appProtocol$Empty3;
        this.caller = appProtocol$Empty4;
    }

    @gk60(name = "broker")
    public static /* synthetic */ void getBroker$annotations() {
    }

    @gk60(name = "caller")
    public static /* synthetic */ void getCaller$annotations() {
    }

    @gk60(name = "dealer")
    public static /* synthetic */ void getDealer$annotations() {
    }

    @gk60(name = "subscriber")
    public static /* synthetic */ void getSubscriber$annotations() {
    }
}
