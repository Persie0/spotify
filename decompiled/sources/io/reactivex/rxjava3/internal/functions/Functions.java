package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p204p.bp11;
import p204p.das;
import p204p.ha3;
import p204p.ot51;
import p204p.qo11;
import p204p.ro11;
import p204p.tnq0;
import p204p.xcw0;
import p204p.xul0;
import p204p.zpe1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Functions {

    /* JADX INFO: renamed from: a */
    public static final Function f7225a = new Identity();

    /* JADX INFO: renamed from: b */
    public static final Runnable f7226b = new EmptyRunnable();

    /* JADX INFO: renamed from: c */
    public static final Action f7227c = new EmptyAction();

    /* JADX INFO: renamed from: d */
    public static final Consumer f7228d = new EmptyConsumer();

    /* JADX INFO: renamed from: e */
    public static final Consumer f7229e = new ErrorConsumer();

    /* JADX INFO: renamed from: f */
    public static final Consumer f7230f = new OnErrorMissingConsumer();

    /* JADX INFO: renamed from: g */
    public static final LongConsumer f7231g = new EmptyLongConsumer();

    /* JADX INFO: renamed from: h */
    public static final Predicate f7232h = new TruePredicate();

    /* JADX INFO: renamed from: i */
    public static final Predicate f7233i = new FalsePredicate();

    /* JADX INFO: renamed from: j */
    public static final Supplier f7234j = new NullProvider();

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ActionConsumer<T> implements Consumer<T> {

        /* JADX INFO: renamed from: a */
        public final Action f7235a;

        public ActionConsumer(Action action) {
            this.f7235a = action;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            this.f7235a.run();
        }
    }

    public static final class Array2Func<T1, T2, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final BiFunction f7236a;

        public Array2Func(BiFunction biFunction) {
            this.f7236a = biFunction;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                return this.f7236a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    public static final class Array3Func<T1, T2, T3, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final Function3 f7237a;

        public Array3Func(Function3 function3) {
            this.f7237a = function3;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            }
            return this.f7237a.mo23408J0(objArr[0], objArr[1], objArr[2]);
        }
    }

    public static final class Array4Func<T1, T2, T3, T4, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final Function4 f7238a;

        public Array4Func(Function4 function4) {
            this.f7238a = function4;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f7238a.mo23409y(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class Array5Func<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final Function5 f7239a;

        public Array5Func(Function5 function5) {
            this.f7239a = function5;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f7239a.mo23410e(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
        }
    }

    public static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final Function6 f7240a;

        public Array6Func(Function6 function6) {
            this.f7240a = function6;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f7240a.mo23411c(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
        }
    }

    public static final class Array7Func<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final Function7 f7241a;

        public Array7Func(Function7 function7) {
            this.f7241a = function7;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return ((tnq0) this.f7241a).m81184b(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class Array8Func<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final Function8 f7242a;

        public Array8Func(Function8 function8) {
            this.f7242a = function8;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f7242a.mo23412b(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class Array9Func<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {
        public Array9Func(Function9 function9) {
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return new qo11((bp11) objArr[0], (das) objArr[1], (zpe1) objArr[2], (ha3) objArr[3], ((Boolean) objArr[4]).booleanValue(), (xcw0) objArr[5], (ro11) objArr[6], (xul0) objArr[7], ((Boolean) objArr[8]).booleanValue());
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ArrayListCapacityCallable<T> implements Supplier<List<T>> {

        /* JADX INFO: renamed from: a */
        public final int f7243a;

        public ArrayListCapacityCallable(int i) {
            this.f7243a = i;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new ArrayList(this.f7243a);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class BooleanSupplierPredicateReverse<T> implements Predicate<T> {

        /* JADX INFO: renamed from: a */
        public final BooleanSupplier f7244a;

        public BooleanSupplierPredicateReverse(BooleanSupplier booleanSupplier) {
            this.f7244a = booleanSupplier;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return !this.f7244a.mo23407a();
        }
    }

    public static final class CastToClass<T, U> implements Function<T, U> {

        /* JADX INFO: renamed from: a */
        public final Class f7245a;

        public CastToClass(Class cls) {
            this.f7245a = cls;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            return this.f7245a.cast(obj);
        }
    }

    public static final class ClassFilter<T, U> implements Predicate<T> {

        /* JADX INFO: renamed from: a */
        public final Class f7246a;

        public ClassFilter(Class cls) {
            this.f7246a = cls;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return this.f7246a.isInstance(obj);
        }
    }

    public static final class EmptyAction implements Action {
        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    public static final class EmptyConsumer implements Consumer<Object> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class EmptyLongConsumer implements LongConsumer {
    }

    public static final class EmptyRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class EqualsPredicate<T> implements Predicate<T> {

        /* JADX INFO: renamed from: a */
        public final Object f7247a;

        public EqualsPredicate(Object obj) {
            this.f7247a = obj;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return Objects.equals(obj, this.f7247a);
        }
    }

    public static final class ErrorConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.m23782b((Throwable) obj);
        }
    }

    public static final class FalsePredicate implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HashSetSupplier implements Supplier<Set<Object>> {

        /* JADX INFO: renamed from: a */
        public static final HashSetSupplier f7248a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ HashSetSupplier[] f7249b;

        static {
            HashSetSupplier hashSetSupplier = new HashSetSupplier("INSTANCE", 0);
            f7248a = hashSetSupplier;
            f7249b = new HashSetSupplier[]{hashSetSupplier};
        }

        public static HashSetSupplier valueOf(String str) {
            return (HashSetSupplier) Enum.valueOf(HashSetSupplier.class, str);
        }

        public static HashSetSupplier[] values() {
            return (HashSetSupplier[]) f7249b.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new HashSet();
        }
    }

    public static final class Identity implements Function<Object, Object> {
        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    public static final class JustValue<T, U> implements Callable<U>, Supplier<U>, Function<T, U> {

        /* JADX INFO: renamed from: a */
        public final Object f7250a;

        public JustValue(Object obj) {
            this.f7250a = obj;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            return this.f7250a;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return this.f7250a;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return this.f7250a;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ListSorter<T> implements Function<List<T>, List<T>> {

        /* JADX INFO: renamed from: a */
        public final Comparator f7251a;

        public ListSorter(Comparator comparator) {
            this.f7251a = comparator;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            List list = (List) obj;
            Collections.sort(list, this.f7251a);
            return list;
        }
    }

    public static final class MaxRequestSubscription implements Consumer<ot51> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            ((ot51) obj).request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes11.dex */
    public static final class NaturalComparator implements Comparator<Object> {

        /* JADX INFO: renamed from: a */
        public static final NaturalComparator f7252a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ NaturalComparator[] f7253b;

        static {
            NaturalComparator naturalComparator = new NaturalComparator("INSTANCE", 0);
            f7252a = naturalComparator;
            f7253b = new NaturalComparator[]{naturalComparator};
        }

        public static NaturalComparator valueOf(String str) {
            return (NaturalComparator) Enum.valueOf(NaturalComparator.class, str);
        }

        public static NaturalComparator[] values() {
            return (NaturalComparator[]) f7253b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class NotificationOnComplete<T> implements Action {

        /* JADX INFO: renamed from: a */
        public final Consumer f7254a;

        public NotificationOnComplete(Consumer consumer) {
            this.f7254a = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
            this.f7254a.accept(Notification.f7193b);
        }
    }

    public static final class NotificationOnError<T> implements Consumer<Throwable> {

        /* JADX INFO: renamed from: a */
        public final Consumer f7255a;

        public NotificationOnError(Consumer consumer) {
            this.f7255a = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            this.f7255a.accept(Notification.m23377a((Throwable) obj));
        }
    }

    public static final class NotificationOnNext<T> implements Consumer<T> {

        /* JADX INFO: renamed from: a */
        public final Consumer f7256a;

        public NotificationOnNext(Consumer consumer) {
            this.f7256a = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            this.f7256a.accept(Notification.m23378b(obj));
        }
    }

    public static final class NullProvider implements Supplier<Object> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return null;
        }
    }

    public static final class OnErrorMissingConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.m23782b(new OnErrorNotImplementedException((Throwable) obj));
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class TimestampFunction<T> implements Function<T, Timed<T>> {

        /* JADX INFO: renamed from: a */
        public final TimeUnit f7257a;

        /* JADX INFO: renamed from: b */
        public final Scheduler f7258b;

        public TimestampFunction(TimeUnit timeUnit, Scheduler scheduler) {
            this.f7257a = timeUnit;
            this.f7258b = scheduler;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            this.f7258b.getClass();
            TimeUnit timeUnit = this.f7257a;
            return new Timed(obj, Scheduler.m23383a(timeUnit), timeUnit);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ToMapKeySelector<K, T> implements BiConsumer<Map<K, T>, T> {

        /* JADX INFO: renamed from: a */
        public final Function f7259a;

        public ToMapKeySelector(Function function) {
            this.f7259a = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((Map) obj).put(this.f7259a.mo98394apply(obj2), obj2);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ToMapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, V>, T> {

        /* JADX INFO: renamed from: a */
        public final Function f7260a;

        /* JADX INFO: renamed from: b */
        public final Function f7261b;

        public ToMapKeyValueSelector(Function function, Function function2) {
            this.f7260a = function;
            this.f7261b = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((Map) obj).put(this.f7261b.mo98394apply(obj2), this.f7260a.mo98394apply(obj2));
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ToMultimapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a */
        public final Function f7262a;

        /* JADX INFO: renamed from: b */
        public final Function f7263b;

        /* JADX INFO: renamed from: c */
        public final Function f7264c;

        public ToMultimapKeyValueSelector(Function function, Function function2, Function function3) {
            this.f7262a = function;
            this.f7263b = function2;
            this.f7264c = function3;
        }

        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) {
            Map map = (Map) obj;
            Object objMo98394apply = this.f7264c.mo98394apply(obj2);
            Collection collection = (Collection) map.get(objMo98394apply);
            if (collection == null) {
                collection = (Collection) this.f7262a.mo98394apply(objMo98394apply);
                map.put(objMo98394apply, collection);
            }
            collection.add(this.f7263b.mo98394apply(obj2));
        }
    }

    public static final class TruePredicate implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return true;
        }
    }

    static {
        new MaxRequestSubscription();
    }

    /* JADX INFO: renamed from: a */
    public static Consumer m23424a(Action action) {
        return new ActionConsumer(action);
    }

    /* JADX INFO: renamed from: b */
    public static Function m23425b(Class cls) {
        return new CastToClass(cls);
    }

    /* JADX INFO: renamed from: c */
    public static Supplier m23426c(int i) {
        return new ArrayListCapacityCallable(i);
    }

    /* JADX INFO: renamed from: d */
    public static Supplier m23427d() {
        return HashSetSupplier.f7248a;
    }

    /* JADX INFO: renamed from: e */
    public static Predicate m23428e(Object obj) {
        return new EqualsPredicate(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Predicate m23429f(Class cls) {
        return new ClassFilter(cls);
    }

    /* JADX INFO: renamed from: g */
    public static Function m23430g(Object obj) {
        return new JustValue(obj);
    }

    /* JADX INFO: renamed from: h */
    public static Supplier m23431h(Object obj) {
        return new JustValue(obj);
    }

    /* JADX INFO: renamed from: i */
    public static Function m23432i(Comparator comparator) {
        return new ListSorter(comparator);
    }

    /* JADX INFO: renamed from: j */
    public static Comparator m23433j() {
        return NaturalComparator.f7252a;
    }

    /* JADX INFO: renamed from: k */
    public static Action m23434k(Consumer consumer) {
        return new NotificationOnComplete(consumer);
    }

    /* JADX INFO: renamed from: l */
    public static Consumer m23435l(Consumer consumer) {
        return new NotificationOnError(consumer);
    }

    /* JADX INFO: renamed from: m */
    public static Consumer m23436m(Consumer consumer) {
        return new NotificationOnNext(consumer);
    }

    /* JADX INFO: renamed from: n */
    public static Predicate m23437n(BooleanSupplier booleanSupplier) {
        return new BooleanSupplierPredicateReverse(booleanSupplier);
    }

    /* JADX INFO: renamed from: o */
    public static Function m23438o(TimeUnit timeUnit, Scheduler scheduler) {
        return new TimestampFunction(timeUnit, scheduler);
    }

    /* JADX INFO: renamed from: p */
    public static Function m23439p(BiFunction biFunction) {
        return new Array2Func(biFunction);
    }

    /* JADX INFO: renamed from: q */
    public static Function m23440q(Function3 function3) {
        return new Array3Func(function3);
    }

    /* JADX INFO: renamed from: r */
    public static Function m23441r(Function4 function4) {
        return new Array4Func(function4);
    }

    /* JADX INFO: renamed from: s */
    public static Function m23442s(Function5 function5) {
        return new Array5Func(function5);
    }

    /* JADX INFO: renamed from: t */
    public static Function m23443t(Function6 function6) {
        return new Array6Func(function6);
    }

    /* JADX INFO: renamed from: u */
    public static Function m23444u(Function7 function7) {
        return new Array7Func(function7);
    }

    /* JADX INFO: renamed from: v */
    public static Function m23445v(Function8 function8) {
        return new Array8Func(function8);
    }

    /* JADX INFO: renamed from: w */
    public static Function m23446w(Function9 function9) {
        return new Array9Func(function9);
    }

    /* JADX INFO: renamed from: x */
    public static BiConsumer m23447x(Function function) {
        return new ToMapKeySelector(function);
    }

    /* JADX INFO: renamed from: y */
    public static BiConsumer m23448y(Function function, Function function2) {
        return new ToMapKeyValueSelector(function2, function);
    }

    /* JADX INFO: renamed from: z */
    public static BiConsumer m23449z(Function function, Function function2, Function function3) {
        return new ToMultimapKeyValueSelector(function3, function2, function);
    }
}
