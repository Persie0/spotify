package p204p;

import android.R;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: p.l8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2081l8 implements ore0 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    /* JADX INFO: renamed from: l */
    public static void m58446l(int i, List list) {
        String strM38563l = edb.m38563l("Element at index ", list.size() - i, " is null.");
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(strM38563l);
    }

    public static UninitializedMessageException newUninitializedMessageException(pre0 pre0Var) {
        return new UninitializedMessageException();
    }

    public abstract AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8);

    /* JADX INFO: renamed from: k */
    public final String m58447k() {
        return s571.m77251j("Reading ", getClass().getName(), " from a ByteString threw an IOException (should never happen).");
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, aux auxVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mo98372mergeFrom((InputStream) new C2043k8(inputStream, owe.m68168s(inputStream, i), 1), auxVar);
        return true;
    }

    @Override // p204p.ore0
    public abstract AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar);

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = ee50.f58680a;
        iterable.getClass();
        if (iterable instanceof yy70) {
            List listMo74623c = ((yy70) iterable).mo74623c();
            yy70 yy70Var = (yy70) list;
            int size = list.size();
            for (Object obj : listMo74623c) {
                if (obj == null) {
                    String strM38563l = edb.m38563l("Element at index ", yy70Var.size() - size, " is null.");
                    for (int size2 = yy70Var.size() - 1; size2 >= size; size2--) {
                        yy70Var.remove(size2);
                    }
                    throw new NullPointerException(strM38563l);
                }
                if (obj instanceof gva) {
                    yy70Var.mo74626u0((gva) obj);
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    yy70Var.mo74626u0(gva.m45886d(0, bArr, bArr.length));
                } else {
                    yy70Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof cer0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof i3t0) {
                i3t0 i3t0Var = (i3t0) list;
                int i = i3t0Var.f98272c + size3;
                Object[] objArr = i3t0Var.f98271b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        i3t0Var.f98271b = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = s571.m77242a(length, 3, 2, 1, 10);
                        }
                        i3t0Var.f98271b = Arrays.copyOf(i3t0Var.f98271b, length);
                    }
                }
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m58446l(size4, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i2 = 0; i2 < size5; i2++) {
            R.attr attrVar = (Object) list2.get(i2);
            if (attrVar == null) {
                m58446l(size4, list);
                throw null;
            }
            list.add(attrVar);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, aux.m27220a());
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC2081l8 mo98375mergeFrom(owe oweVar) {
        return mergeFrom(oweVar, aux.m27220a());
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC2081l8 mo98373mergeFrom(gva gvaVar) throws InvalidProtocolBufferException {
        try {
            owe oweVarMo34018o = gvaVar.mo34018o();
            mo98375mergeFrom(oweVarMo34018o);
            oweVarMo34018o.mo2020a(0);
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m58447k(), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC2081l8 mo98374mergeFrom(gva gvaVar, aux auxVar) throws InvalidProtocolBufferException {
        try {
            owe oweVarMo34018o = gvaVar.mo34018o();
            mergeFrom(oweVarMo34018o, auxVar);
            oweVarMo34018o.mo2020a(0);
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m58447k(), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC2081l8 mo98376mergeFrom(byte[] bArr) {
        return mo98329mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC2081l8 mo98377mergeFrom(byte[] bArr, aux auxVar) {
        return mo98330mergeFrom(bArr, 0, bArr.length, auxVar);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC2081l8 mo98371mergeFrom(InputStream inputStream) {
        owe oweVarM68167g = owe.m68167g(inputStream);
        mo98375mergeFrom(oweVarM68167g);
        oweVarM68167g.mo2020a(0);
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC2081l8 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
        owe oweVarM68167g = owe.m68167g(inputStream);
        mergeFrom(oweVarM68167g, auxVar);
        oweVarM68167g.mo2020a(0);
        return this;
    }

    @Override // p204p.ore0
    public AbstractC2081l8 mergeFrom(pre0 pre0Var) {
        if (getDefaultInstanceForType().getClass().isInstance(pre0Var)) {
            return internalMergeFrom((AbstractC2118m8) pre0Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
