package com.spotify.cosmos.fireandforgetresolver;

import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.routercallback.ResolverCallbackReceiver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bH&¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000bH&¢\u0006\u0004\b\u0006\u0010\fJ3\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000b2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bH&¢\u0006\u0004\b\u0006\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bH&¢\u0006\u0004\b\u0010\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H&¢\u0006\u0004\b\u0015\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/fireandforgetresolver/FireAndForgetResolver;", "", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/cosmos/cosmos/Response;", "query", "Lp/w2a1;", "detached", "(Lio/reactivex/rxjava3/core/Single;)V", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "resolverCallbackReceiver", "(Lio/reactivex/rxjava3/core/Single;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)V", "Lio/reactivex/rxjava3/core/Observable;", "(Lio/reactivex/rxjava3/core/Observable;)V", "(Lio/reactivex/rxjava3/core/Observable;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)V", "Lcom/spotify/cosmos/cosmos/Request;", "request", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;)V", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)V", "dispose", "()V", "reset", "src_main_java_com_spotify_cosmos_fireandforgetresolver-fireandforgetresolver"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface FireAndForgetResolver {
    void detached(Observable<? extends Response> query);

    void detached(Observable<? extends Response> query, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver);

    void detached(Single<? extends Response> query);

    void detached(Single<? extends Response> query, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver);

    void dispose();

    void reset();

    void resolve(Request request);

    void resolve(Request request, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver);
}
