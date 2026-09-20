package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.rxrouter.RxRouter;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ServiceMethodImpl;", "Lcom/spotify/cosmos/cosmonautatoms/ServiceMethod;", "method", "Ljava/lang/reflect/Method;", "requestTransformers", "Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;", "typeTransformers", "Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformers;", "<init>", "(Ljava/lang/reflect/Method;Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformers;)V", "requestAtom", "Lcom/spotify/cosmos/cosmonautatoms/RequestAtom;", "returnTypeTransformer", "Lcom/spotify/cosmos/cosmonautatoms/ResponseTransformer;", "returnTypeConverter", "Lcom/spotify/cosmos/cosmonautatoms/ReturnTypeConverter;", "create", "", "resolver", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "args", "", "(Lcom/spotify/cosmos/rxrouter/RxRouter;[Ljava/lang/Object;)Ljava/lang/Object;", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ServiceMethodImpl implements ServiceMethod {
    private final RequestAtom requestAtom;
    private final ReturnTypeConverter returnTypeConverter;
    private final ResponseTransformer returnTypeTransformer;

    public ServiceMethodImpl(Method method, RequestTransformers requestTransformers, ResponseTransformers responseTransformers) {
        this.requestAtom = new RequestAtom(method, requestTransformers);
        this.returnTypeTransformer = responseTransformers.create(method.getGenericReturnType());
        this.returnTypeConverter = ReturnTypeConverters.INSTANCE.find(method);
    }

    @Override // com.spotify.cosmos.cosmonautatoms.ServiceMethod
    public Object create(RxRouter resolver, Object[] args) {
        return this.returnTypeConverter.convert(this.returnTypeTransformer, resolver.resolve(this.requestAtom.call(args)));
    }
}
