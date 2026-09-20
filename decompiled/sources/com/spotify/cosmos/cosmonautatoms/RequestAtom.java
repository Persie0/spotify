package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmos.Request;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import p204p.wl51;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0012\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/RequestAtom;", "", "method", "Ljava/lang/reflect/Method;", "requestTransformers", "Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;", "<init>", "(Ljava/lang/reflect/Method;Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;)V", "action", "", "pathAtom", "Lcom/spotify/cosmos/cosmonautatoms/PathAtom;", "queryAtom", "Lcom/spotify/cosmos/cosmonautatoms/QueryAtom;", "headersAtom", "Lcom/spotify/cosmos/cosmonautatoms/HeadersAtom;", "bodyAtom", "Lcom/spotify/cosmos/cosmonautatoms/BodyAtom;", "call", "Lcom/spotify/cosmos/cosmos/Request;", "args", "", "([Ljava/lang/Object;)Lcom/spotify/cosmos/cosmos/Request;", "pathAndQuery", "uri", "queryParams", "", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class RequestAtom {
    private final String action;
    private final BodyAtom bodyAtom;
    private final HeadersAtom headersAtom;
    private final PathAtom pathAtom;
    private final QueryAtom queryAtom;

    public RequestAtom(Method method, RequestTransformers requestTransformers) {
        this.action = ReflectionUtil.INSTANCE.findAction(method);
        this.pathAtom = new PathAtom(method);
        this.queryAtom = new QueryAtom(method);
        this.headersAtom = new HeadersAtom(method);
        this.bodyAtom = new BodyAtom(method, requestTransformers);
    }

    public final Request call(Object[] args) {
        return new Request(this.action, pathAndQuery(this.pathAtom.call(args), this.queryAtom.call(args)), this.headersAtom.call(args), this.bodyAtom.call(args));
    }

    public final String pathAndQuery(String uri, Map<String, String> queryParams) {
        if (queryParams.isEmpty()) {
            return uri;
        }
        StringBuilder sb = new StringBuilder(uri);
        int iM88457G0 = wl51.m88457G0(uri, '?', 0, 6);
        if (iM88457G0 < 0) {
            sb.append('?');
        } else if (iM88457G0 < sb.length() - 1) {
            sb.append('&');
        }
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            sb.append('&');
        }
        return sb.delete(sb.length() - 1, sb.length()).toString();
    }
}
