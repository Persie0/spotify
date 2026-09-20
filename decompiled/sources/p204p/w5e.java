package p204p;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class w5e implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248067a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f248068b;

    public /* synthetic */ w5e(Object obj, int i) {
        this.f248067a = i;
        this.f248068b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f248067a) {
            case 0:
                ChipGroup chipGroup = (ChipGroup) this.f248068b;
                if (!chipGroup.f2108M0) {
                    if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.f2112h) {
                        chipGroup.m1615c(compoundButton.getId(), true);
                        chipGroup.f2107L0 = compoundButton.getId();
                    } else {
                        int id = compoundButton.getId();
                        if (z) {
                            int i = chipGroup.f2107L0;
                            if (i != -1 && i != id && chipGroup.f2111g) {
                                chipGroup.m1615c(i, false);
                            }
                            chipGroup.setCheckedId(id);
                        } else if (chipGroup.f2107L0 == id) {
                            chipGroup.setCheckedId(-1);
                        }
                    }
                    break;
                }
                break;
            case 1:
                compoundButton.setChecked(false);
                gh00 gh00Var = (gh00) ((xzo) this.f248068b).f267727b;
                if (gh00Var != null) {
                    gh00Var.invoke(tlz0.f221552a);
                }
                break;
            default:
                ((C2580xm) this.f248068b).invoke(Boolean.valueOf(z));
                break;
        }
    }
}
