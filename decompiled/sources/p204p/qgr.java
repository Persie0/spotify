package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes11.dex */
public final class qgr implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sgr f188521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f188522b;

    public qgr(sgr sgrVar, int i) {
        this.f188521a = sgrVar;
        this.f188522b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f188521a.f208928b.m44529a(s571.m77246e(this.f188522b, "pin_limit_reached_"));
    }
}
