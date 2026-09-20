package p204p;

import com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol.WheelControlConfigurationValidator$ValidationException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class rqd1 implements hwf {

    /* JADX INFO: renamed from: a */
    public final pqd1 f201817a;

    /* JADX INFO: renamed from: b */
    public final qqd1 f201818b;

    public rqd1(pqd1 pqd1Var, qqd1 qqd1Var) {
        int iIntValue;
        int i = pqd1Var.f180290b;
        int i2 = pqd1Var.f180289a;
        Integer num = qqd1Var.f191546c;
        this.f201817a = pqd1Var;
        this.f201818b = qqd1Var;
        ArrayList arrayList = new ArrayList();
        int i3 = pqd1Var.f180291c;
        if (i3 <= 0) {
            arrayList.add(new WheelControlConfigurationValidator$ValidationException.StepSmallerThanOne(edb.m38563l("step(", i3, ") must be bigger than 0")));
        }
        if (num != null && (iIntValue = num.intValue()) <= 0) {
            arrayList.add(new WheelControlConfigurationValidator$ValidationException.MinorLabelStepSmallerThanOne(edb.m38563l("minorLabelsStep(", iIntValue, ") must be bigger than 0")));
        }
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList();
            if (i2 > i) {
                arrayList.add(new WheelControlConfigurationValidator$ValidationException.RangeMinBiggerThanRangeMax(edb.m38560i(i2, i, "rangeMin(", ") must be smaller than rangeMax(", ")")));
            }
            if (50 < i3) {
                arrayList.add(new WheelControlConfigurationValidator$ValidationException.LabelStepIsSmallerThanStep(edb.m38563l("labelStep(", i3, ") must be bigger than step(50)")));
            }
            if (num != null) {
                int iIntValue2 = num.intValue();
                if (iIntValue2 < i3) {
                    arrayList.add(new WheelControlConfigurationValidator$ValidationException.MinorLabelStepIsSmallerThanStep(edb.m38560i(iIntValue2, i3, "minorLabelsStep(", ") must be bigger than step(", ")")));
                }
                if (iIntValue2 >= 50) {
                    arrayList.add(new WheelControlConfigurationValidator$ValidationException.MinorLabelStepNotSmallerThanLabelStep(edb.m38563l("minorLabelsStep(", iIntValue2, ") must be smaller than labelsStep(50)")));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = new ArrayList();
                if (50 % i3 != 0) {
                    arrayList.add(new WheelControlConfigurationValidator$ValidationException.LabelStepNotReachableByStep(edb.m38563l("labelStep(50) must be reachable by step(", i3, ")")));
                }
                if (num != null) {
                    int iIntValue3 = num.intValue();
                    if (iIntValue3 % i3 != 0) {
                        arrayList.add(new WheelControlConfigurationValidator$ValidationException.MinorLabelStepNotReachableByStep(edb.m38560i(iIntValue3, i3, "minorLabelsStep(", ") must be reachable by step(", ")")));
                    }
                }
                if ((i - i2) % i3 != 0) {
                    arrayList.add(new WheelControlConfigurationValidator$ValidationException.RangeMaxNotReachableByStep(klh.m56832d(i2, ")", dq60.m36619s(i3, i, "step(", ") should be divisor of rangeMax(", ") - rangeMin("))));
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(edb.m38564m("WheelControl Configuration is invalid:\n$", g6f.m43753y0(arrayList2, "\n", null, null, null, 62)));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            y85.m93061f(illegalStateException, (WheelControlConfigurationValidator$ValidationException) it.next());
        }
        throw illegalStateException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqd1)) {
            return false;
        }
        rqd1 rqd1Var = (rqd1) obj;
        return wj50.m88271j(this.f201817a, rqd1Var.f201817a) && wj50.m88271j(this.f201818b, rqd1Var.f201818b);
    }

    public final int hashCode() {
        return this.f201818b.hashCode() + (this.f201817a.hashCode() * 31);
    }
}
