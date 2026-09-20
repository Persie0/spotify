package p204p;

import android.app.Application;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class qau0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Application f186929a;

    /* JADX INFO: renamed from: b */
    public String f186930b;

    /* JADX INFO: renamed from: c */
    public String f186931c;

    /* JADX INFO: renamed from: d */
    public ArrayList f186932d;

    /* JADX INFO: renamed from: e */
    public boolean f186933e;

    /* JADX INFO: renamed from: f */
    public long f186934f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f186935g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ wau0 f186936h;

    /* JADX INFO: renamed from: i */
    public int f186937i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qau0(wau0 wau0Var, ibk ibkVar) {
        super(ibkVar);
        this.f186936h = wau0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186935g = obj;
        this.f186937i |= Integer.MIN_VALUE;
        return wau0.m87613a(this.f186936h, null, null, null, null, this);
    }
}
