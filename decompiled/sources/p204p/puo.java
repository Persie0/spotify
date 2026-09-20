package p204p;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.messaging.messagingplatformdebug.items.DelayChooser;
import com.spotify.notifications.models.preferences.ShowOptInMetadata;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class puo implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f181511b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f181512c;

    public /* synthetic */ puo(int i, Object obj, Object obj2) {
        this.f181510a = i;
        this.f181511b = obj;
        this.f181512c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1931hb c1931hb;
        int i;
        AbstractC2158nb c2121mb;
        switch (this.f181510a) {
            case 0:
                quo quoVar = (quo) this.f181511b;
                AbstractC2158nb abstractC2158nb = quoVar.f192747b;
                if (abstractC2158nb == null || (c1931hb = abstractC2158nb.f152143a) == null || (i = c1931hb.f89341b) == 0) {
                    return;
                }
                gh00 gh00Var = (gh00) this.f181512c;
                AppCompatCheckBox appCompatCheckBox = quoVar.f192752g;
                if (abstractC2158nb instanceof C2084lb) {
                    C2084lb c2084lb = (C2084lb) abstractC2158nb;
                    c2121mb = new C2084lb(c2084lb.f131475b, c2084lb.f131476c, c2084lb.f131477d, new C1931hb(appCompatCheckBox.isChecked(), i), c2084lb.f131479f);
                } else {
                    if (!(abstractC2158nb instanceof C2121mb)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C2121mb c2121mb2 = (C2121mb) abstractC2158nb;
                    c2121mb = new C2121mb(c2121mb2.f141752b, new C1931hb(appCompatCheckBox.isChecked(), i), c2121mb2.f141754d, c2121mb2.f141755e);
                }
                quoVar.f192747b = c2121mb;
                gh00Var.invoke(new C1973ib(z, i));
                return;
            case 1:
                int i2 = ((j7q0) this.f181512c).f109651b;
                zyp zypVar = (zyp) this.f181511b;
                ArrayList arrayList = zypVar.f287653h;
                if (z) {
                    arrayList.add(Integer.valueOf(i2));
                } else {
                    arrayList.remove(Integer.valueOf(i2));
                }
                ((EncoreButton) zypVar.f287649d.f224372h).setEnabled(!arrayList.isEmpty());
                gh00 gh00Var2 = zypVar.f287654i;
                if (gh00Var2 != null) {
                    gh00Var2.invoke(new d7q0(i2));
                    return;
                } else {
                    wj50.m88260d0("eventConsumer");
                    throw null;
                }
            case 2:
                DelayChooser delayChooser = (DelayChooser) this.f181511b;
                delayChooser.f5511b.setEnabled(z);
                ((gh00) this.f181512c).invoke(Integer.valueOf(DelayChooser.m15321a(delayChooser)));
                return;
            default:
                ((i4k0) this.f181511b).f98540f.f139981b.onNext(new url0(((ShowOptInMetadata) this.f181512c).showUri, z));
                return;
        }
    }
}
