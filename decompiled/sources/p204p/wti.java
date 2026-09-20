package p204p;

import android.view.KeyEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class wti implements jc41 {

    /* JADX INFO: renamed from: a */
    public final a7p f254949a;

    /* JADX INFO: renamed from: b */
    public final x7p f254950b;

    /* JADX INFO: renamed from: c */
    public final i8a f254951c;

    public wti(a7p a7pVar, x7p x7pVar, i8a i8aVar) {
        this.f254949a = a7pVar;
        this.f254950b = x7pVar;
        this.f254951c = i8aVar;
    }

    @Override // p204p.jc41
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f254951c.isEnabled()) {
            x7p x7pVar = this.f254950b;
            if (((Boolean) x7pVar.f258963h.f158717a.getValue()).booleanValue()) {
                Objects.toString(x7pVar.f258963h.f158717a.getValue());
                return false;
            }
        }
        return this.f254949a.m24985a(keyEvent, "volume_on_key_down_main_activity", cgi.f37668M0);
    }
}
