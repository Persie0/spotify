package p204p;

import com.spotify.musicappplatform.bottomsheet.compose.ReflectionBasedDragHandler;

/* JADX INFO: loaded from: classes8.dex */
public final class spv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212961a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReflectionBasedDragHandler f212962b;

    /* JADX INFO: renamed from: c */
    public int f212963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spv0(ReflectionBasedDragHandler reflectionBasedDragHandler, fbk fbkVar) {
        super(fbkVar);
        this.f212962b = reflectionBasedDragHandler;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212961a = obj;
        this.f212963c |= Integer.MIN_VALUE;
        return this.f212962b.settle(0.0f, this);
    }
}
