package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ipi0 implements List, rq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104508a;

    /* JADX INFO: renamed from: b */
    public final Object f104509b;

    /* JADX INFO: renamed from: c */
    public final int f104510c;

    /* JADX INFO: renamed from: d */
    public int f104511d;

    public /* synthetic */ ipi0(int i, int i2, int i3, List list) {
        this.f104508a = i3;
        this.f104509b = list;
        this.f104510c = i;
        this.f104511d = i2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f104508a) {
            case 0:
                int i = this.f104511d;
                this.f104511d = i + 1;
                this.f104509b.add(i, obj);
                break;
            default:
                int i2 = this.f104511d;
                this.f104511d = i2 + 1;
                this.f104509b.add(i2, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.f104508a) {
            case 0:
                this.f104509b.addAll(i + this.f104510c, collection);
                this.f104511d = collection.size() + this.f104511d;
                return collection.size() > 0;
            default:
                this.f104509b.addAll(i + this.f104510c, collection);
                int size = collection.size();
                this.f104511d += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f104508a) {
            case 0:
                int i = this.f104511d - 1;
                int i2 = this.f104510c;
                if (i2 <= i) {
                    while (true) {
                        this.f104509b.remove(i);
                        if (i != i2) {
                            i--;
                        }
                    }
                }
                this.f104511d = i2;
                break;
            default:
                int i3 = this.f104511d - 1;
                int i4 = this.f104510c;
                if (i4 <= i3) {
                    while (true) {
                        this.f104509b.remove(i3);
                        if (i3 != i4) {
                            i3--;
                        }
                    }
                }
                this.f104511d = i4;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f104508a) {
            case 0:
                int i = this.f104511d;
                for (int i2 = this.f104510c; i2 < i; i2++) {
                    if (wj50.m88271j(this.f104509b.get(i2), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i3 = this.f104511d;
                for (int i4 = this.f104510c; i4 < i3; i4++) {
                    if (wj50.m88271j(this.f104509b.get(i4), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f104508a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f104508a) {
            case 0:
                dmk0.m36418a(i, this);
                return this.f104509b.get(i + this.f104510c);
            default:
                rqi0.m76249a(i, this);
                return this.f104509b.get(i + this.f104510c);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f104508a) {
            case 0:
                int i = this.f104511d;
                int i2 = this.f104510c;
                for (int i3 = i2; i3 < i; i3++) {
                    if (wj50.m88271j(this.f104509b.get(i3), obj)) {
                        return i3 - i2;
                    }
                }
                return -1;
            default:
                int i4 = this.f104511d;
                int i5 = this.f104510c;
                for (int i6 = i5; i6 < i4; i6++) {
                    if (wj50.m88271j(this.f104509b.get(i6), obj)) {
                        return i6 - i5;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f104508a) {
            case 0:
                return this.f104511d == this.f104510c;
            default:
                return this.f104511d == this.f104510c;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f104508a) {
            case 0:
                return new gpi0(0, 0, this);
            default:
                return new gpi0(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f104508a) {
            case 0:
                int i = this.f104511d - 1;
                int i2 = this.f104510c;
                if (i2 <= i) {
                    while (!wj50.m88271j(this.f104509b.get(i), obj)) {
                        if (i != i2) {
                            i--;
                        }
                    }
                    return i - i2;
                }
                return -1;
            default:
                int i3 = this.f104511d - 1;
                int i4 = this.f104510c;
                if (i4 <= i3) {
                    while (!wj50.m88271j(this.f104509b.get(i3), obj)) {
                        if (i3 != i4) {
                            i3--;
                        }
                    }
                    return i3 - i4;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f104508a) {
            case 0:
                return new gpi0(0, 0, this);
            default:
                return new gpi0(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f104508a) {
            case 0:
                int i = this.f104511d;
                for (int i2 = this.f104510c; i2 < i; i2++) {
                    ?? r2 = this.f104509b;
                    if (wj50.m88271j(r2.get(i2), obj)) {
                        r2.remove(i2);
                        this.f104511d--;
                        return true;
                    }
                }
                return false;
            default:
                int i3 = this.f104511d;
                for (int i4 = this.f104510c; i4 < i3; i4++) {
                    ?? r3 = this.f104509b;
                    if (wj50.m88271j(r3.get(i4), obj)) {
                        r3.remove(i4);
                        this.f104511d--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f104508a) {
            case 0:
                int i = this.f104511d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.f104511d;
            default:
                int i2 = this.f104511d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.f104511d;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f104508a) {
            case 0:
                int i = this.f104511d;
                int i2 = i - 1;
                int i3 = this.f104510c;
                if (i3 <= i2) {
                    while (true) {
                        ?? r3 = this.f104509b;
                        if (!collection.contains(r3.get(i2))) {
                            r3.remove(i2);
                            this.f104511d--;
                        }
                        if (i2 != i3) {
                            i2--;
                        }
                    }
                }
                return i != this.f104511d;
            default:
                int i4 = this.f104511d;
                int i5 = i4 - 1;
                int i6 = this.f104510c;
                if (i6 <= i5) {
                    while (true) {
                        ?? r4 = this.f104509b;
                        if (!collection.contains(r4.get(i5))) {
                            r4.remove(i5);
                            this.f104511d--;
                        }
                        if (i5 != i6) {
                            i5--;
                        }
                    }
                }
                return i4 != this.f104511d;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f104508a) {
            case 0:
                dmk0.m36418a(i, this);
                return this.f104509b.set(i + this.f104510c, obj);
            default:
                rqi0.m76249a(i, this);
                return this.f104509b.set(i + this.f104510c, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f104508a) {
            case 0:
                i = this.f104511d;
                i2 = this.f104510c;
                break;
            default:
                i = this.f104511d;
                i2 = this.f104510c;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f104508a) {
            case 0:
                dmk0.m36419b(i, i2, this);
                return new ipi0(i, i2, 0, this);
            default:
                rqi0.m76250b(i, i2, this);
                return new ipi0(i, i2, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f104508a) {
            case 0:
                break;
        }
        return wj50.m88262e0(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.f104508a) {
            case 0:
                this.f104509b.add(i + this.f104510c, obj);
                this.f104511d++;
                break;
            default:
                this.f104509b.add(i + this.f104510c, obj);
                this.f104511d++;
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f104508a) {
            case 0:
                return new gpi0(i, 0, this);
            default:
                return new gpi0(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f104508a) {
            case 0:
                break;
        }
        return wj50.m88264f0(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f104508a) {
            case 0:
                this.f104509b.addAll(this.f104511d, collection);
                this.f104511d = collection.size() + this.f104511d;
                return collection.size() > 0;
            default:
                this.f104509b.addAll(this.f104511d, collection);
                int size = collection.size();
                this.f104511d += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.f104508a) {
            case 0:
                dmk0.m36418a(i, this);
                Object objRemove = this.f104509b.remove(i + this.f104510c);
                this.f104511d--;
                return objRemove;
            default:
                rqi0.m76249a(i, this);
                Object objRemove2 = this.f104509b.remove(i + this.f104510c);
                this.f104511d--;
                return objRemove2;
        }
    }
}
