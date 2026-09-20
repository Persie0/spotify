package p204p;

import com.spotify.gamesservice.musicguesser.p071v1.GetGameResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class yp00 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f274783a;

    /* JADX INFO: renamed from: b */
    public GetGameResponse f274784b;

    /* JADX INFO: renamed from: c */
    public String f274785c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f274786d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zp00 f274787e;

    /* JADX INFO: renamed from: f */
    public int f274788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp00(zp00 zp00Var, ibk ibkVar) {
        super(ibkVar);
        this.f274787e = zp00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274786d = obj;
        this.f274788f |= Integer.MIN_VALUE;
        return zp00.m96656a(this.f274787e, null, this);
    }
}
