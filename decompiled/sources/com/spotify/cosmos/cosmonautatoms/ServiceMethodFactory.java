package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\tR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ServiceMethodFactory;", "", "factories", "", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "<init>", "(Ljava/util/List;)V", "serviceMethodCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/reflect/Method;", "Lcom/spotify/cosmos/cosmonautatoms/ServiceMethod;", "requestTransformers", "Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;", "responseTransformers", "Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformers;", "loadServiceMethod", "method", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ServiceMethodFactory {
    private final RequestTransformers requestTransformers;
    private final ResponseTransformers responseTransformers;
    private final ConcurrentHashMap<Method, ServiceMethod> serviceMethodCache = new ConcurrentHashMap<>();

    public ServiceMethodFactory(List<? extends Converter.Factory> list) {
        this.requestTransformers = new RequestTransformers(list);
        this.responseTransformers = new ResponseTransformers(list);
    }

    public final ServiceMethod loadServiceMethod(Method method) {
        ServiceMethod serviceMethod = this.serviceMethodCache.get(method);
        if (serviceMethod != null) {
            return serviceMethod;
        }
        synchronized (this.serviceMethodCache) {
            ServiceMethod serviceMethod2 = this.serviceMethodCache.get(method);
            if (serviceMethod2 != null) {
                return serviceMethod2;
            }
            ServiceMethodImpl serviceMethodImpl = new ServiceMethodImpl(method, this.requestTransformers, this.responseTransformers);
            this.serviceMethodCache.put(method, serviceMethodImpl);
            return serviceMethodImpl;
        }
    }
}
