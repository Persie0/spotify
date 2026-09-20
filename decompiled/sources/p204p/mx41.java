package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class mx41 {

    /* JADX INFO: renamed from: a */
    public final int f147952a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f147953b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f147954c;

    public mx41(Context context, XmlResourceParser xmlResourceParser) {
        this.f147954c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22713q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f147952a = typedArrayObtainStyledAttributes.getResourceId(index, this.f147952a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f147954c);
                this.f147954c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m63083a(nx41 nx41Var) {
        this.f147953b.add(nx41Var);
    }

    /* JADX INFO: renamed from: b */
    public final int m63084b(float f, float f2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f147953b;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((nx41) arrayList.get(i)).m65818a(f, f2)) {
                return i;
            }
            i++;
        }
    }
}
