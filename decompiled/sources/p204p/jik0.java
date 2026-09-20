package p204p;

import com.spotify.core.http.CronetRuntime;

/* JADX INFO: loaded from: classes3.dex */
public final class jik0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8j0 f112786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jik0(s8j0 s8j0Var, int i) {
        super(0);
        this.f112785a = i;
        this.f112786b = s8j0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f112785a) {
            case 0:
                return (wi7) this.f112786b.f206655a;
            default:
                return (CronetRuntime) this.f112786b.f206670p;
        }
    }
}
