package p204p;

import com.spotify.address.endpoint.model.p012v1.proto.FormField;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class ysa0 {
    /* JADX INFO: renamed from: a */
    public static ssa0 m94460a(FormField formField, String str) {
        Object next;
        Iterator<E> it = formField.m2388y().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            FormField.ValidationRule validationRule = (FormField.ValidationRule) next;
            int iM2424t = validationRule.m2424t();
            int i = iM2424t == 0 ? -1 : usa0.f233574c[edb.m38547C(iM2424t)];
            if (i != -1) {
                if (i != 1) {
                    if (i == 2) {
                        if (!Pattern.matches(validationRule.m2423s().m2429p(), str == null ? "" : str)) {
                            break;
                        }
                    } else if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (str == null || wl51.m88460J0(str)) {
                    break;
                }
            }
        }
        FormField.ValidationRule validationRule2 = (FormField.ValidationRule) next;
        if (validationRule2 != null) {
            return new ssa0(validationRule2.m2422r(), validationRule2.m2421q());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Next m94461b(ytw ytwVar) {
        Integer num;
        return Next.m15607i(tuh0.f223864a, Collections.singleton(new rgt((ytwVar == null || (num = ytwVar.f276226a) == null || num.intValue() != 401) ? tw1.f224295b : uw1.f234544b)));
    }
}
