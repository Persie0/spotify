package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.Metadata;
import p204p.fk60;
import p204p.i4t0;
import p204p.ku51;
import p204p.p0i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u001c\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmosDeps;", "", "Lp/i4t0;", "Lio/reactivex/rxjava3/core/Scheduler;", "ioSchedulerProvider", "Lp/ku51;", "Lcom/spotify/cosmos/cosmos/Response;", "subscriptionTrackerProvider", "Lp/p0i0;", "moshiProvider", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouterProvider", "Lp/fk60;", "jsonProvider", "<init>", "(Lp/i4t0;Lp/i4t0;Lp/i4t0;Lp/i4t0;Lp/i4t0;)V", "Lp/i4t0;", "getIoSchedulerProvider", "()Lp/i4t0;", "getIoSchedulerProvider$annotations", "()V", "getSubscriptionTrackerProvider", "getMoshiProvider", "getRxRouterProvider", "getJsonProvider", "getJsonProvider$annotations", "getIoScheduler", "()Lio/reactivex/rxjava3/core/Scheduler;", "ioScheduler", "getSubscriptionTracker", "()Lp/ku51;", "subscriptionTracker", "getMoshi", "()Lp/p0i0;", "moshi", "getRxRouter", "()Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouter", "getJson", "()Lp/fk60;", "json", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosDeps {
    private final i4t0 ioSchedulerProvider;
    private final i4t0 jsonProvider;
    private final i4t0 moshiProvider;
    private final i4t0 rxRouterProvider;
    private final i4t0 subscriptionTrackerProvider;

    public CosmosDeps(i4t0 i4t0Var, i4t0 i4t0Var2, i4t0 i4t0Var3, i4t0 i4t0Var4, i4t0 i4t0Var5) {
        this.ioSchedulerProvider = i4t0Var;
        this.subscriptionTrackerProvider = i4t0Var2;
        this.moshiProvider = i4t0Var3;
        this.rxRouterProvider = i4t0Var4;
        this.jsonProvider = i4t0Var5;
    }

    public static /* synthetic */ void getIoSchedulerProvider$annotations() {
    }

    public static /* synthetic */ void getJsonProvider$annotations() {
    }

    public final Scheduler getIoScheduler() {
        return (Scheduler) this.ioSchedulerProvider.get();
    }

    public final i4t0 getIoSchedulerProvider() {
        return this.ioSchedulerProvider;
    }

    public final fk60 getJson() {
        return (fk60) this.jsonProvider.get();
    }

    public final i4t0 getJsonProvider() {
        return this.jsonProvider;
    }

    public final p0i0 getMoshi() {
        return (p0i0) this.moshiProvider.get();
    }

    public final i4t0 getMoshiProvider() {
        return this.moshiProvider;
    }

    public final RxRouter getRxRouter() {
        return (RxRouter) this.rxRouterProvider.get();
    }

    public final i4t0 getRxRouterProvider() {
        return this.rxRouterProvider;
    }

    public final ku51 getSubscriptionTracker() {
        return (ku51) this.subscriptionTrackerProvider.get();
    }

    public final i4t0 getSubscriptionTrackerProvider() {
        return this.subscriptionTrackerProvider;
    }
}
