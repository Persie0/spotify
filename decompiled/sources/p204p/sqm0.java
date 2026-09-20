package p204p;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public final class sqm0 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tqm0 f213116a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ geu f213117b;

    public sqm0(geu geuVar, tqm0 tqm0Var) {
        this.f213117b = geuVar;
        this.f213116a = tqm0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            return this.f213117b.m44523a();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f213116a.mo50301n((vqm0) obj);
    }
}
