package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.Converter;
import com.spotify.cosmos.rxrouter.RxRouter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\f2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/CosmonautHandler;", "", "factories", "", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "<init>", "(Ljava/util/List;)V", "serviceMethodFactory", "Lcom/spotify/cosmos/cosmonautatoms/ServiceMethodFactory;", "create", "T", "service", "Ljava/lang/Class;", "rxRouter", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "(Ljava/lang/Class;Lcom/spotify/cosmos/rxrouter/RxRouter;)Ljava/lang/Object;", "handle", "method", "Ljava/lang/reflect/Method;", "args", "", "handle$src_main_java_com_spotify_cosmos_cosmonautatoms_cosmonautatoms", "(Lcom/spotify/cosmos/rxrouter/RxRouter;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmonautHandler {
    private final ServiceMethodFactory serviceMethodFactory;

    public CosmonautHandler(List<? extends Converter.Factory> list) {
        this.serviceMethodFactory = new ServiceMethodFactory(list);
    }

    public final <T> T create(Class<T> service, final RxRouter rxRouter) {
        return (T) Proxy.newProxyInstance(service.getClassLoader(), new Class[]{service}, new InvocationHandler() { // from class: com.spotify.cosmos.cosmonautatoms.CosmonautHandler.create.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object o, Method method, Object[] objects) {
                return CosmonautHandler.this.m8157x4869b5fb(rxRouter, method, objects);
            }
        });
    }

    /* JADX INFO: renamed from: handle$src_main_java_com_spotify_cosmos_cosmonautatoms_cosmonautatoms */
    public final Object m8157x4869b5fb(RxRouter rxRouter, Method method, Object[] args) {
        return wj50.m88271j(method.getDeclaringClass(), Object.class) ? method.invoke(this, args) : this.serviceMethodFactory.loadServiceMethod(method).create(rxRouter, args);
    }
}
